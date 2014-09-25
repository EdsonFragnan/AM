package br.com.gamezon.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="GM_BAIRRO")
@SequenceGenerator(name="BairroSeq", sequenceName="SEQ_GM_BAIRRO", allocationSize=1)
public class Bairro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5008761718989321140L;


	public Bairro() {
		super();
	}
	
	public Bairro(int codigoBairro, Cidade cidade, String bairro) {
		super();
		this.codigoBairro = codigoBairro;
		this.cidade = cidade;
		this.bairro = bairro;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="BairroSeq")
	@Column(name="CODIGO_BAIRRO")
	private int codigoBairro;
	
	@JoinColumn(name="CODIGO_CIDADE")
	@Column(name="CODIGO_CIDADE", columnDefinition="NUMBER(8)")
	private Cidade cidade;
	
	@Column(name="BAIRRO", length=40)
	private String bairro;
	
			
	public int getCodigoBairro() {	
		return codigoBairro;		
	}
	
	public void setCodigoBairro(int codigoBairro) {	
		this.codigoBairro = codigoBairro;		
	}	
		
	public Cidade getCidade() {	
		return cidade;		
	}
	
	public void setCidade(Cidade cidade) {	
		this.cidade = cidade;		
	}	
		
	public String getBairro() {	
		return bairro;		
	}
	
	public void setBairro(String bairro) {	
		this.bairro = bairro;		
	}	
	
}