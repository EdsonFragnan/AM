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
@Table(name="GM_PAIS")
@SequenceGenerator(name="PaisSeq", sequenceName="SEQ_GM_PAIS", allocationSize=1)
public class Pais implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4543108157816036554L;


	public Pais() {
		super();
	}
	
	public Pais(int codigoPais, String pais, char sigla) {
		super();
		this.codigoPais = codigoPais;
		this.pais = pais;
		this.sigla = sigla;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PaisSeq")
	@Column(name="CODIGO_PAIS")
	private int codigoPais;
	
	@Column(name="PAIS", length=30)
	private String pais;
	
	@Column(name="SIGLA", length=2)
	private char sigla;
	
			
	public int getCodigoPais() {	
		return codigoPais;		
	}
	
	public void setCodigoPais(int codigoPais) {	
		this.codigoPais = codigoPais;		
	}	
		
	public String getPais() {	
		return pais;		
	}
	
	public void setPais(String pais) {	
		this.pais = pais;		
	}	
		
	public char getSigla() {	
		return sigla;		
	}
	
	public void setSigla(char sigla) {	
		this.sigla = sigla;		
	}	
	
}