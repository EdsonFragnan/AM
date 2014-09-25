package br.com.gamezon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name="GM_PESSOA_JURIDICA")
@SequenceGenerator(name="PessoaJuridicaSeq", sequenceName="SEQ_GM_PESSOA_JURIDICA", allocationSize=1)
@PrimaryKeyJoinColumn(name="CODIGO_CLIENTE", referencedColumnName="CODIGO_CLIENTE")
public class PessoaJuridica extends Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3062815846343789116L;


	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj, String ie) {
		super();
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.ie = ie;
		}	
	
	@Column(name="RAZAO_SOCIAL", length=120)
	private String razaoSocial;
	
	@Column(name="NOME_FANTASIA", length=70)
	private String nomeFantasia;
	
	@Column(name="CNPJ", length=15)
	private String cnpj;
	
	@Column(name="IE", length=15)
	private String ie;
	
			
	public String getRazaoSocial() {	
		return razaoSocial;		
	}
	
	public void setRazaoSocial(String razaoSocial) {	
		this.razaoSocial = razaoSocial;		
	}	
		
	public String getNomeFantasia() {	
		return nomeFantasia;		
	}
	
	public void setNomeFantasia(String nomeFantasia) {	
		this.nomeFantasia = nomeFantasia;		
	}	
		
	public String getCnpj() {	
		return cnpj;		
	}
	
	public void setCnpj(String cnpj) {	
		this.cnpj = cnpj;		
	}	
		
	public String getIe() {	
		return ie;		
	}
	
	public void setIe(String ie) {	
		this.ie = ie;		
	}	
	
}