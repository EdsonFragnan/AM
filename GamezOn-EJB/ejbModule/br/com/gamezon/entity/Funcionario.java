package br.com.gamezon.entity;

import java.util.Calendar;
import javax.persistence.Temporal;
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
@Table(name="GM_FUNCIONARIO")
@SequenceGenerator(name="FuncionarioSeq", sequenceName="SEQ_GM_FUNCIONARIO", allocationSize=1)
public class Funcionario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3326861610100057933L;


	public Funcionario() {
		super();
	}
	
	public Funcionario(int codigoFuncionario, String nomeFuncionario, Calendar dataNascimento, Calendar dataAdmissao, Calendar dataDemissao) {
		super();
		this.codigoFuncionario = codigoFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.dataNascimento = dataNascimento;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="FuncionarioSeq")
	@Column(name="CODIGO_FUNCIONARIO")
	private int codigoFuncionario;
	
	@Column(name="NOME_FUNCIONARIO", length=120)
	private String nomeFuncionario;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_NASCIMENTO")
	private Calendar dataNascimento;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_ADMISSAO")
	private Calendar dataAdmissao;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_DEMISSAO")
	private Calendar dataDemissao;
	
			
	public int getCodigoFuncionario() {	
		return codigoFuncionario;		
	}
	
	public void setCodigoFuncionario(int codigoFuncionario) {	
		this.codigoFuncionario = codigoFuncionario;		
	}	
		
	public String getNomeFuncionario() {	
		return nomeFuncionario;		
	}
	
	public void setNomeFuncionario(String nomeFuncionario) {	
		this.nomeFuncionario = nomeFuncionario;		
	}	
		
	public Calendar getDataNascimento() {	
		return dataNascimento;		
	}
	
	public void setDataNascimento(Calendar dataNascimento) {	
		this.dataNascimento = dataNascimento;		
	}	
		
	public Calendar getDataAdmissao() {	
		return dataAdmissao;		
	}
	
	public void setDataAdmissao(Calendar dataAdmissao) {	
		this.dataAdmissao = dataAdmissao;		
	}	
		
	public Calendar getDataDemissao() {	
		return dataDemissao;		
	}
	
	public void setDataDemissao(Calendar dataDemissao) {	
		this.dataDemissao = dataDemissao;		
	}	
	
}