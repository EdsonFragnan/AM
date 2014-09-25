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
@Table(name="GM_LOGRADOURO")
@SequenceGenerator(name="LogradouroSeq", sequenceName="SEQ_GM_LOGRADOURO", allocationSize=1)
public class Logradouro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8380485557840715299L;


	public Logradouro() {
		super();
	}
	
	public Logradouro(int codigoLogradouro, Bairro bairro, TipoLogradouro tipologradouro, String cep, String logradouro) {
		super();
		this.codigoLogradouro = codigoLogradouro;
		this.bairro = bairro;
		this.tipologradouro = tipologradouro;
		this.cep = cep;
		this.logradouro = logradouro;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="LogradouroSeq")
	@Column(name="CODIGO_LOGRADOURO")
	private int codigoLogradouro;
	
	@JoinColumn(name="CODIGO_BAIRRO")
	@Column(name="CODIGO_BAIRRO", columnDefinition="NUMBER(8)")
	private Bairro bairro;
	
	@JoinColumn(name="CODIGO_TIPO_LOGRADOURO")
	@Column(name="CODIGO_TIPO_LOGRADOURO", columnDefinition="NUMBER(8)")
	private TipoLogradouro tipologradouro;
	
	@Column(name="CEP", length=8)
	private String cep;
	
	@Column(name="LOGRADOURO", length=100)
	private String logradouro;
	
			
	public int getCodigoLogradouro() {	
		return codigoLogradouro;		
	}
	
	public void setCodigoLogradouro(int codigoLogradouro) {	
		this.codigoLogradouro = codigoLogradouro;		
	}	
		
	public Bairro getBairro() {	
		return bairro;		
	}
	
	public void setBairro(Bairro bairro) {	
		this.bairro = bairro;		
	}	
		
	public TipoLogradouro getTipoLogradouro() {	
		return tipologradouro;		
	}
	
	public void setTipoLogradouro(TipoLogradouro tipologradouro) {	
		this.tipologradouro = tipologradouro;		
	}	
		
	public String getCep() {	
		return cep;		
	}
	
	public void setCep(String cep) {	
		this.cep = cep;		
	}	
		
	public String getLogradouro() {	
		return logradouro;		
	}
	
	public void setLogradouro(String logradouro) {	
		this.logradouro = logradouro;		
	}	
	
}