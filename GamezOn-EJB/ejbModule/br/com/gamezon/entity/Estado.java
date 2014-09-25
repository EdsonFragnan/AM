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
@Table(name="GM_ESTADO")
@SequenceGenerator(name="EstadoSeq", sequenceName="SEQ_GM_ESTADO", allocationSize=1)
public class Estado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4050189460285372773L;


	public Estado() {
		super();
	}
	
	public Estado(int codigoEstado, Pais pais, String estado, char sigla) {
		super();
		this.codigoEstado = codigoEstado;
		this.pais = pais;
		this.estado = estado;
		this.sigla = sigla;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="EstadoSeq")
	@Column(name="CODIGO_ESTADO")
	private int codigoEstado;
	
	@JoinColumn(name="CODIGO_PAIS")
	@Column(name="CODIGO_PAIS", columnDefinition="NUMBER(8)")
	private Pais pais;
	
	@Column(name="ESTADO", length=30)
	private String estado;
	
	@Column(name="SIGLA", length=2)
	private char sigla;
	
			
	public int getCodigoEstado() {	
		return codigoEstado;		
	}
	
	public void setCodigoEstado(int codigoEstado) {	
		this.codigoEstado = codigoEstado;		
	}	
		
	public Pais getPais() {	
		return pais;		
	}
	
	public void setPais(Pais pais) {	
		this.pais = pais;		
	}	
		
	public String getEstado() {	
		return estado;		
	}
	
	public void setEstado(String estado) {	
		this.estado = estado;		
	}	
		
	public char getSigla() {	
		return sigla;		
	}
	
	public void setSigla(char sigla) {	
		this.sigla = sigla;		
	}	
	
}