package br.com.tidicas.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tidicas.dados.Cadastro;
import br.com.tidicas.dados.CadastroItens;


/**
 * 	@author Evaldo Junior
 * 	@since 25/02/2016
 * 	@version 1.0
 */	
public class CreateTabelas {
	 public static void main(String[] args) {
		    
		 	EntityManagerFactory factory = Persistence.createEntityManagerFactory("testJava"); 
		 	EntityManager em = factory.createEntityManager(); 		    
		 	
		 	em.getTransaction().begin();

		 	/*1 Cadastro A*/
		 	Cadastro cadastro1 = new Cadastro();
	        cadastro1.setDescricao("cadastro 1");
	        
		 	List<CadastroItens> cadastroItens = new ArrayList<CadastroItens>();
		 	CadastroItens cadastroItem1 = new CadastroItens();
	        cadastroItem1.setParametro1("A");
	        cadastroItem1.setParametro2("B");
	        cadastroItem1.setQuantidade(10);
	        cadastroItem1.setCadastro(cadastro1);

		 	cadastroItens.add(cadastroItem1);
		 	
		 	CadastroItens cadastroItem2 = new CadastroItens();
		 	cadastroItem2.setParametro1("C");
		 	cadastroItem2.setParametro2("D");
		 	cadastroItem2.setQuantidade(15);
		 	cadastroItem2.setCadastro(cadastro1);
	        
	        cadastroItens.add(cadastroItem2);
	        
	        cadastro1.setCadadastroItens(cadastroItens);
	        
	        em.persist(cadastro1);

	        /*1 Cadastro B*/
		 	Cadastro cadastro2 = new Cadastro();
	        cadastro2.setDescricao("cadastro 2");
	        
	        cadastroItens =null;
		 	cadastroItens = new ArrayList<CadastroItens>();
		 	CadastroItens cadastroItem3 = new CadastroItens();
	        cadastroItem3.setParametro1("E");
	        cadastroItem3.setParametro2("F");
	        cadastroItem3.setQuantidade(20);
	        cadastroItem3.setCadastro(cadastro2);

		 	cadastroItens.add(cadastroItem3);
		 	
		 	CadastroItens cadastroItem4 = new CadastroItens();
		 	cadastroItem4.setParametro1("G");
		 	cadastroItem4.setParametro2("H");
		 	cadastroItem4.setQuantidade(25);
		 	cadastroItem4.setCadastro(cadastro2);
	        
	        cadastroItens.add(cadastroItem4);
	        
	        cadastro1.setCadadastroItens(cadastroItens);
	        
	        em.persist(cadastro2);

	        em.getTransaction().commit();

	        em.close();
	        
		    factory.close();
	 }
}