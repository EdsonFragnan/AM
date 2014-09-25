package br.com.gamezon.entity;

import java.util.Calendar;
import javax.persistence.Temporal;
import javax.persistence.JoinColumn;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.TemporalType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="GM_CONTATO")
@SequenceGenerator(name="ContatoSeq", sequenceName="SEQ_GM_CONTATO", allocationSize=1)
public class Contato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7581860383094451040L;


	public Contato() {
		super();
	}
	
	public Contato(int codigoContato, String nomeContato, char sexo, Calendar dataNascimento, Cliente cliente) {
		super();
		this.codigoContato = codigoContato;
		this.nomeContato = nomeContato;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.cliente = cliente;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ContatoSeq")
	@Column(name="CODIGO_CONTATO")
	private int codigoContato;
	
	@Column(name="NOME_CONTATO", length=60)
	private String nomeContato;
	
	@Column(name="SEXO", length=1)
	private char sexo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_NASCIMENTO")
	private Calendar dataNascimento;
	
	@JoinColumn(name="CODIGO_CLIENTE")
	@Column(name="CODIGO_CLIENTE", columnDefinition="NUMBER(8)")
	private Cliente cliente;
	
			
	public int getCodigoContato() {	
		return codigoContato;		
	}
	
	public void setCodigoContato(int codigoContato) {	
		this.codigoContato = codigoContato;		
	}	
		
	public String getNomeContato() {	
		return nomeContato;		
	}
	
	public void setNomeContato(String nomeContato) {	
		this.nomeContato = nomeContato;		
	}	
		
	public char getSexo() {	
		return sexo;		
	}
	
	public void setSexo(char sexo) {	
		this.sexo = sexo;		
	}	
		
	public Calendar getDataNascimento() {	
		return dataNascimento;		
	}
	
	public void setDataNascimento(Calendar dataNascimento) {	
		this.dataNascimento = dataNascimento;		
	}	
		
	public Cliente getCliente() {	
		return cliente;		
	}
	
	public void setCliente(Cliente cliente) {	
		this.cliente = cliente;		
	}	
	
}