package br.com.tidicas.to;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Cadastro")
public class CadastroXmlTo {

	
	private Long cadastroId;
	
	
	private Integer quantidade;
	
	
	public Long getCadastroId() {
		return cadastroId;
	}
	
	@XmlElement
	public void setCadastroId(Long cadastroId) {
		this.cadastroId = cadastroId;
	}
	
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	@XmlElement
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

}
