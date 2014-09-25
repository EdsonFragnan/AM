package br.com.gamezon.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="GM_TIPO_LOGRADOURO")
@SequenceGenerator(name="TipoLogradouroSeq", sequenceName="SEQ_GM_TIPO_LOGRADOURO", allocationSize=1)
public class TipoLogradouro implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4543217836993094249L;


	public TipoLogradouro() {
		super();
	}
	
	public TipoLogradouro(int codigoTipoLogradouro, String tipo, char sigla) {
		super();
		this.codigoTipoLogradouro = codigoTipoLogradouro;
		this.tipo = tipo;
		this.sigla = sigla;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="TipoLogradouroSeq")
	@Column(name="CODIGO_TIPO_LOGRADOURO")
	private int codigoTipoLogradouro;
	
	@Column(name="TIPO", length=20)
	private String tipo;
	
	@Column(name="SIGLA", length=2)
	private char sigla;
	
			
	public int getCodigoTipoLogradouro() {	
		return codigoTipoLogradouro;		
	}
	
	public void setCodigoTipoLogradouro(int codigoTipoLogradouro) {	
		this.codigoTipoLogradouro = codigoTipoLogradouro;		
	}	
		
	public String getTipo() {	
		return tipo;		
	}
	
	public void setTipo(String tipo) {	
		this.tipo = tipo;		
	}	
		
	public char getSigla() {	
		return sigla;		
	}
	
	public void setSigla(char sigla) {	
		this.sigla = sigla;		
	}	
	
}