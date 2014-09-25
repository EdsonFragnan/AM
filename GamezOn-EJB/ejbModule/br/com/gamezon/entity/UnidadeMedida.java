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
@Table(name="GM_UNIDADE_MEDIDA")
@SequenceGenerator(name="UnidadeMedidaSeq", sequenceName="SEQ_GM_UNIDADE_MEDIDA", allocationSize=1)
public class UnidadeMedida implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7577638215825515232L;


	public UnidadeMedida() {
		super();
	}
	
	public UnidadeMedida(int codigoMedida, String descricao, String simbolo) {
		super();
		this.codigoMedida = codigoMedida;
		this.descricao = descricao;
		this.simbolo = simbolo;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="UnidadeMedidaSeq")
	@Column(name="CODIGO_MEDIDA")
	private int codigoMedida;
	
	@Column(name="DESCRICAO", length=70)
	private String descricao;
	
	@Column(name="SIMBOLO", length=4)
	private String simbolo;
	
			
	public int getCodigoMedida() {	
		return codigoMedida;		
	}
	
	public void setCodigoMedida(int codigoMedida) {	
		this.codigoMedida = codigoMedida;		
	}	
		
	public String getDescricao() {	
		return descricao;		
	}
	
	public void setDescricao(String descricao) {	
		this.descricao = descricao;		
	}	
		
	public String getSimbolo() {	
		return simbolo;		
	}
	
	public void setSimbolo(String simbolo) {	
		this.simbolo = simbolo;		
	}	
	
}