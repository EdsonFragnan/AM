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
@Table(name="GM_CIDADE")
@SequenceGenerator(name="CidadeSeq", sequenceName="SEQ_GM_CIDADE", allocationSize=1)
public class Cidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3009148088750972105L;


	public Cidade() {
		super();
	}
	
	public Cidade(int codigoCidade, Estado estado, String cidade) {
		super();
		this.codigoCidade = codigoCidade;
		this.estado = estado;
		this.cidade = cidade;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="CidadeSeq")
	@Column(name="CODIGO_CIDADE")
	private int codigoCidade;
	
	@JoinColumn(name="CODIGO_ESTADO")
	@Column(name="CODIGO_ESTADO", columnDefinition="NUMBER(8)")
	private Estado estado;
	
	@Column(name="CIDADE", length=40)
	private String cidade;
	
			
	public int getCodigoCidade() {	
		return codigoCidade;		
	}
	
	public void setCodigoCidade(int codigoCidade) {	
		this.codigoCidade = codigoCidade;		
	}	
		
	public Estado getEstado() {	
		return estado;		
	}
	
	public void setEstado(Estado estado) {	
		this.estado = estado;		
	}	
		
	public String getCidade() {	
		return cidade;		
	}
	
	public void setCidade(String cidade) {	
		this.cidade = cidade;		
	}	
	
}