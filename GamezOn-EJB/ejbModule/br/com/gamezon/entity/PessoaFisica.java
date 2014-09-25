package br.com.gamezon.entity;

import java.util.Calendar;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.Column;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="GM_PESSOA_FISICA")
@SequenceGenerator(name="PessoaFisicaSeq", sequenceName="SEQ_GM_PESSOA_FISICA", allocationSize=1)
@PrimaryKeyJoinColumn(name="CODIGO_CLIENTE", referencedColumnName="CODIGO_CLIENTE")
public class PessoaFisica extends Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4516491132218283371L;

	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(Calendar dataNascimento, String cpf, String rg) {
		super();
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.rg = rg;
		}	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_NASCIMENTO")
	private Calendar dataNascimento;
	
	@Column(name="CPF", length=11)
	private String cpf;
	
	@Column(name="RG", length=10)
	private String rg;
	
	public Calendar getDataNascimento() {	
		return dataNascimento;		
	}
	
	public void setDataNascimento(Calendar dataNascimento) {	
		this.dataNascimento = dataNascimento;		
	}	
		
	public String getCpf() {	
		return cpf;		
	}
	
	public void setCpf(String cpf) {	
		this.cpf = cpf;		
	}	
		
	public String getRg() {	
		return rg;		
	}
	
	public void setRg(String rg) {	
		this.rg = rg;		
	}	
	
}