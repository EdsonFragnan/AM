package br.com.gamezon.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.io.Serializable;

@Entity(name="GM_CLIENTE")
@Table(name="GM_CLIENTE")
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 447189167329290052L;


	public Cliente() {
		super();
	}
	
	public Cliente(int codigoCliente, String nome) {
		super();
		this.codigoCliente = codigoCliente;
		this.nome = nome;
		}	
	
	@Id
	@SequenceGenerator(name="ClienteSeq", sequenceName="SEQ_GM_CLIENTE", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ClienteSeq")
	@Column(name="CODIGO_CLIENTE")
	private int codigoCliente;
	
	@Column(name="NOME", length=128)
	private String nome;
	
			
	public int getCodigoCliente() {	
		return codigoCliente;		
	}
	
	public void setCodigoCliente(int codigoCliente) {	
		this.codigoCliente = codigoCliente;		
	}	
		
	public String getNome() {	
		return nome;		
	}
	
	public void setNome(String nome) {	
		this.nome = nome;		
	}	
	
}