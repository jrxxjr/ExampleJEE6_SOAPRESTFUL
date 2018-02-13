package br.com.tidicas.business;

import java.io.Serializable;
import java.util.HashMap;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.tidicas.dados.CadastroItens;
import br.com.tidicas.dao.CadastroItensDao;
import br.com.tidicas.to.CadastroItensTo;
import br.com.tidicas.to.CadastroTo;

@Stateless
public class CadastroItensBusinessImpl implements CadastroItensBusiness, Serializable{
	
	private static final long serialVersionUID = -1965283677653488122L;

	@Inject 
	private CadastroItensDao cadastroItensDao;

	public CadastroTo returnServico(CadastroItensTo cadastroItensTo){
		CadastroTo result = new CadastroTo();
		
		if (cadastroItensTo.getParametro1()==null ||
				cadastroItensTo.getParametro2()==null){
			throw new NullPointerException("Nenhum parametro de entrada pode ser nulo"); 
		}
		
		HashMap<String, Object> parametros = new HashMap<String, Object>();    	    	
    	parametros.put("parametro1", cadastroItensTo.getParametro1());
    	parametros.put("parametro2", cadastroItensTo.getParametro2());
    	    	
    	String sql = "SELECT a FROM CadastroItens a WHERE a.parametro1 = :parametro1 and " +    	 
    				 "a.parametro2 = :parametro2";
    	
    	CadastroItens cadastroItens = cadastroItensDao.findOneResult(sql,parametros);
    	
    	if (cadastroItens!=null) {
    	
			if (cadastroItens.getParametro1().equalsIgnoreCase("A") && cadastroItens.getParametro2().equalsIgnoreCase("B")){
	    		result.setCadastroId(cadastroItens.getCadastro().getId());
	    		result.setQuantidade(cadastroItens.getQuantidade());    	
	    		
			} else if (cadastroItens.getParametro1().equalsIgnoreCase("C") && cadastroItens.getParametro2().equalsIgnoreCase("D")){
	    		result.setCadastroId(cadastroItens.getCadastro().getId());
	    		result.setQuantidade(cadastroItens.getQuantidade());
	    		
			} else if (cadastroItens.getParametro1().equalsIgnoreCase("E") && cadastroItens.getParametro2().equalsIgnoreCase("F")){
	    		result.setCadastroId(cadastroItens.getCadastro().getId());
	    		result.setQuantidade(cadastroItens.getQuantidade());
	    		
			} else if (cadastroItens.getParametro1().equalsIgnoreCase("G") && cadastroItens.getParametro2().equalsIgnoreCase("H")){
	    		result.setCadastroId(cadastroItens.getCadastro().getId());
	    		result.setQuantidade(cadastroItens.getQuantidade());
	    		
	    	}
			    
    	}
    	
		return result;
		
	}
	
}