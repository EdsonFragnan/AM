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
@Table(name="GM_TELEFONE")
@SequenceGenerator(name="TelefoneSeq", sequenceName="SEQ_GM_TELEFONE", allocationSize=1)
public class Telefone implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2623588508085763332L;


	public Telefone() {
		super();
	}
	
	public Telefone(int codigoTelefone, Contato contato, String ddd, String telefone, char tipoTelefone) {
		super();
		this.codigoTelefone = codigoTelefone;
		this.contato = contato;
		this.ddd = ddd;
		this.telefone = telefone;
		this.tipoTelefone = tipoTelefone;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="TelefoneSeq")
	@Column(name="CODIGO_TELEFONE")
	private int codigoTelefone;
	
	@JoinColumn(name="CODIGO_CONTATO")
	@Column(name="CODIGO_CONTATO", columnDefinition="NUMBER(8)")
	private Contato contato;
	
	@Column(name="DDD", length=3)
	private String ddd;
	
	@Column(name="TELEFONE", length=10)
	private String telefone;
	
	@Column(name="TIPO_TELEFONE", length=1)
	private char tipoTelefone;
	
			
	public int getCodigoTelefone() {	
		return codigoTelefone;		
	}
	
	public void setCodigoTelefone(int codigoTelefone) {	
		this.codigoTelefone = codigoTelefone;		
	}	
		
	public Contato getContato() {	
		return contato;		
	}
	
	public void setContato(Contato contato) {	
		this.contato = contato;		
	}	
		
	public String getDdd() {	
		return ddd;		
	}
	
	public void setDdd(String ddd) {	
		this.ddd = ddd;		
	}	
		
	public String getTelefone() {	
		return telefone;		
	}
	
	public void setTelefone(String telefone) {	
		this.telefone = telefone;		
	}	
		
	public char getTipoTelefone() {	
		return tipoTelefone;		
	}
	
	public void setTipoTelefone(char tipoTelefone) {	
		this.tipoTelefone = tipoTelefone;		
	}	
	
}