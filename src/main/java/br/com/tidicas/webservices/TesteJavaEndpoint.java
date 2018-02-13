package br.com.tidicas.webservices;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.tidicas.business.CadastroItensBusiness;
import br.com.tidicas.to.CadastroItensTo;
import br.com.tidicas.to.CadastroTo;


@WebService(targetNamespace = "http://localhost:8080/test", 
name = "TesteJavaEndpoint", 
serviceName = "TesteJavaEndPointService") @SOAPBinding(style = Style.RPC)

/**
 * WebService responsavel pelo retorno de informacoes de cadastro 
 * 
 * */

public class TesteJavaEndpoint implements TesteJavaWs{
	
	@Inject
	private CadastroItensBusiness cadastroItensBusiness;
	
	
    @Override
    @WebMethod(operationName="returnServico",action="returnServico" )
    public CadastroTo returnServico(@WebParam(name = "parametro1") String parametro1, 
    		@WebParam(name = "parametro2") String parametro2) {
    
    	
    	CadastroItensTo cadastroItensTo = new CadastroItensTo();
    	cadastroItensTo.setParametro1(parametro1);
    	cadastroItensTo.setParametro2(parametro2);
    	
    	
    	/* Toda regra de negocio vai no ejb, nao pode ter regra de negocio no webservice */
    	CadastroTo result = cadastroItensBusiness.returnServico(cadastroItensTo);
    	
        return result;
    }
    
}