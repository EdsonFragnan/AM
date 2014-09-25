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
@Table(name="GM_FORNECEDOR")
@SequenceGenerator(name="FornecedorSeq", sequenceName="SEQ_GM_FORNECEDOR", allocationSize=1)
public class Fornecedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3192662029209747773L;


	public Fornecedor() {
		super();
	}
	
	public Fornecedor(int codigoForncedor, String nome, char status) {
		super();
		this.codigoForncedor = codigoForncedor;
		this.nome = nome;
		this.status = status;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="FornecedorSeq")
	@Column(name="CODIGO_FORNCEDOR")
	private int codigoForncedor;
	
	@Column(name="NOME", length=150)
	private String nome;
	
	@Column(name="STATUS", length=1)
	private char status;
	
			
	public int getCodigoForncedor() {	
		return codigoForncedor;		
	}
	
	public void setCodigoForncedor(int codigoForncedor) {	
		this.codigoForncedor = codigoForncedor;		
	}	
		
	public String getNome() {	
		return nome;		
	}
	
	public void setNome(String nome) {	
		this.nome = nome;		
	}	
		
	public char getStatus() {	
		return status;		
	}
	
	public void setStatus(char status) {	
		this.status = status;		
	}	
	
}