package br.com.tidicas.business;

import javax.ejb.Local;

import br.com.tidicas.to.CadastroItensTo;
import br.com.tidicas.to.CadastroTo;

@Local
public interface CadastroItensBusiness {

	public CadastroTo returnServico(CadastroItensTo cadastroItensTo);
}
