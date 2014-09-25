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
@Table(name="GM_PRODUTO")
@SequenceGenerator(name="ProdutoSeq", sequenceName="SEQ_GM_PRODUTO", allocationSize=1)
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1509906868669084386L;


	public Produto() {
		super();
	}
	
	public Produto(int codigoProduto, TipoProduto tipo, UnidadeMedida medida, String codigoInterno, String descricao, double valorUnitario, Fornecedor forncedor, String urlImagem) {
		super();
		this.codigoProduto = codigoProduto;
		this.tipo = tipo;
		this.medida = medida;
		this.codigoInterno = codigoInterno;
		this.descricao = descricao;
		this.valorUnitario = valorUnitario;
		this.forncedor = forncedor;
		this.urlImagem = urlImagem;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ProdutoSeq")
	@Column(name="CODIGO_PRODUTO")
	private int codigoProduto;
	
	@JoinColumn(name="CODIGO_TIPO")
	@Column(name="CODIGO_TIPO", columnDefinition="NUMBER(8)")
	private TipoProduto tipo;
	
	@JoinColumn(name="CODIGO_MEDIDA")
	@Column(name="CODIGO_MEDIDA", columnDefinition="NUMBER(8)")
	private UnidadeMedida medida;
	
	@Column(name="CODIGO_INTERNO", length=7)
	private String codigoInterno;
	
	@Column(name="DESCRICAO", length=80)
	private String descricao;
	
	@Column(name="VALOR_UNITARIO", columnDefinition="NUMBER(     10.20)")
	private double valorUnitario;
	
	@JoinColumn(name="CODIGO_FORNCEDOR")
	@Column(name="CODIGO_FORNCEDOR", columnDefinition="NUMBER(8)")
	private Fornecedor forncedor;
	
	@Column(name="URL_IMAGEM", length=255)
	private String urlImagem;
	
			
	public int getCodigoProduto() {	
		return codigoProduto;		
	}
	
	public void setCodigoProduto(int codigoProduto) {	
		this.codigoProduto = codigoProduto;		
	}	
		
	public TipoProduto getTipo() {	
		return tipo;		
	}
	
	public void setTipo(TipoProduto tipo) {	
		this.tipo = tipo;		
	}	
		
	public UnidadeMedida getMedida() {	
		return medida;		
	}
	
	public void setMedida(UnidadeMedida medida) {	
		this.medida = medida;		
	}	
		
	public String getCodigoInterno() {	
		return codigoInterno;		
	}
	
	public void setCodigoInterno(String codigoInterno) {	
		this.codigoInterno = codigoInterno;		
	}	
		
	public String getDescricao() {	
		return descricao;		
	}
	
	public void setDescricao(String descricao) {	
		this.descricao = descricao;		
	}	
		
	public double getValorUnitario() {	
		return valorUnitario;		
	}
	
	public void setValorUnitario(double valorUnitario) {	
		this.valorUnitario = valorUnitario;		
	}	
		
	public Fornecedor getForncedor() {	
		return forncedor;		
	}
	
	public void setForncedor(Fornecedor forncedor) {	
		this.forncedor = forncedor;		
	}	
		
	public String getUrlImagem() {	
		return urlImagem;		
	}
	
	public void setUrlImagem(String urlImagem) {	
		this.urlImagem = urlImagem;		
	}	
	
}