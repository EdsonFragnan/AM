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
@Table(name="GM_TIPO_PRODUTO")
@SequenceGenerator(name="TipoProdutoSeq", sequenceName="SEQ_GM_TIPO_PRODUTO", allocationSize=1)
public class TipoProduto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2341381330067340223L;


	public TipoProduto() {
		super();
	}
	
	public TipoProduto(int codigoTipo, String descricao) {
		super();
		this.codigoTipo = codigoTipo;
		this.descricao = descricao;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="TipoProdutoSeq")
	@Column(name="CODIGO_TIPO")
	private int codigoTipo;
	
	@Column(name="DESCRICAO", length=80)
	private String descricao;
	
			
	public int getCodigoTipo() {	
		return codigoTipo;		
	}
	
	public void setCodigoTipo(int codigoTipo) {	
		this.codigoTipo = codigoTipo;		
	}	
		
	public String getDescricao() {	
		return descricao;		
	}
	
	public void setDescricao(String descricao) {	
		this.descricao = descricao;		
	}	
	
}