package br.com.tidicas.webservices;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.tidicas.business.CadastroItensBusiness;
import br.com.tidicas.to.CadastroItensTo;
import br.com.tidicas.to.CadastroTo;
import br.com.tidicas.to.CadastroXmlTo;

@Stateless 
@Path("/testejavarest")
public class TesteJavaRest {

	@Inject
	private CadastroItensBusiness cadastroItensBusiness;
	
	@GET
	@Path("{parametro1}/{parametro2}")
	@Produces(MediaType.APPLICATION_XML)

	public CadastroXmlTo returnServico(@PathParam("parametro1") String parametro1,
									   @PathParam("parametro2") String parametro2) {

		CadastroItensTo cadastroItensTo = new CadastroItensTo();
		cadastroItensTo.setParametro1(parametro1);
		cadastroItensTo.setParametro2(parametro2);
    	
    	/* Toda regra de negocio vai no ejb, nao pode ter regra de negocio no webservice */
    	CadastroTo cadastroTo = cadastroItensBusiness.returnServico(cadastroItensTo);
    	CadastroXmlTo result = new CadastroXmlTo();
    	result.setCadastroId(cadastroTo.getCadastroId());
    	result.setQuantidade(cadastroTo.getQuantidade());
    	
		//return Response.status(200).entity(result).build();
    	return result;
	}
}
