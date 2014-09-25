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
@Table(name="GM_ENDERECO")
@SequenceGenerator(name="EnderecoSeq", sequenceName="SEQ_GM_ENDERECO", allocationSize=1)
public class Endereco implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2182857079350504046L;


	public Endereco() {
		super();
	}
	
	public Endereco(int codigoEndereco, Logradouro logradouro, String numero, String complemento, Calendar dataInicio, Calendar dataFim, Cliente cliente) {
		super();
		this.codigoEndereco = codigoEndereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.cliente = cliente;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="EnderecoSeq")
	@Column(name="CODIGO_ENDERECO")
	private int codigoEndereco;
	
	@JoinColumn(name="CODIGO_LOGRADOURO")
	@Column(name="CODIGO_LOGRADOURO", columnDefinition="NUMBER(8)")
	private Logradouro logradouro;
	
	@Column(name="NUMERO", length=5)
	private String numero;
	
	@Column(name="COMPLEMENTO", length=10)
	private String complemento;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_INICIO")
	private Calendar dataInicio;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_FIM")
	private Calendar dataFim;
	
	@JoinColumn(name="CODIGO_CLIENTE")
	@Column(name="CODIGO_CLIENTE", columnDefinition="NUMBER(8)")
	private Cliente cliente;
	
			
	public int getCodigoEndereco() {	
		return codigoEndereco;		
	}
	
	public void setCodigoEndereco(int codigoEndereco) {	
		this.codigoEndereco = codigoEndereco;		
	}	
		
	public Logradouro getLogradouro() {	
		return logradouro;		
	}
	
	public void setLogradouro(Logradouro logradouro) {	
		this.logradouro = logradouro;		
	}	
		
	public String getNumero() {	
		return numero;		
	}
	
	public void setNumero(String numero) {	
		this.numero = numero;		
	}	
		
	public String getComplemento() {	
		return complemento;		
	}
	
	public void setComplemento(String complemento) {	
		this.complemento = complemento;		
	}	
		
	public Calendar getDataInicio() {	
		return dataInicio;		
	}
	
	public void setDataInicio(Calendar dataInicio) {	
		this.dataInicio = dataInicio;		
	}	
		
	public Calendar getDataFim() {	
		return dataFim;		
	}
	
	public void setDataFim(Calendar dataFim) {	
		this.dataFim = dataFim;		
	}	
		
	public Cliente getCliente() {	
		return cliente;		
	}
	
	public void setCliente(Cliente cliente) {	
		this.cliente = cliente;		
	}	
	
}