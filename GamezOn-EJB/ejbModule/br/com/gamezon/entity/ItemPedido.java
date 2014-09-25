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
@Table(name="GM_ITEM_PEDIDO")
@SequenceGenerator(name="ItemPedidoSeq", sequenceName="SEQ_GM_ITEM_PEDIDO", allocationSize=1)
public class ItemPedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4696732643936124651L;


	public ItemPedido() {
		super();
	}
	
	public ItemPedido(int numeroItem, Pedido pedido, Produto produto, double valorUnitario, int quantidade) {
		super();
		this.numeroItem = numeroItem;
		this.pedido = pedido;
		this.produto = produto;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="ItemPedidoSeq")
	@Column(name="NUMERO_ITEM")
	private int numeroItem;
	
	@JoinColumn(name="CODIGO_PEDIDO")
	@Column(name="CODIGO_PEDIDO", columnDefinition="NUMBER(8)")
	private Pedido pedido;
	
	@JoinColumn(name="CODIGO_PRODUTO")
	@Column(name="CODIGO_PRODUTO", columnDefinition="NUMBER(8)")
	private Produto produto;
	
	@Column(name="VALOR_UNITARIO", columnDefinition="NUMBER(     10.20)")
	private double valorUnitario;
	
	@Column(name="QUANTIDADE", columnDefinition="NUMBER(         4)")
	private int quantidade;
	
			
	public int getNumeroItem() {	
		return numeroItem;		
	}
	
	public void setNumeroItem(int numeroItem) {	
		this.numeroItem = numeroItem;		
	}	
		
	public Pedido getPedido() {	
		return pedido;		
	}
	
	public void setPedido(Pedido pedido) {	
		this.pedido = pedido;		
	}	
		
	public Produto getProduto() {	
		return produto;		
	}
	
	public void setProduto(Produto produto) {	
		this.produto = produto;		
	}	
		
	public double getValorUnitario() {	
		return valorUnitario;		
	}
	
	public void setValorUnitario(double valorUnitario) {	
		this.valorUnitario = valorUnitario;		
	}	
		
	public int getQuantidade() {	
		return quantidade;		
	}
	
	public void setQuantidade(int quantidade) {	
		this.quantidade = quantidade;		
	}	
	
}