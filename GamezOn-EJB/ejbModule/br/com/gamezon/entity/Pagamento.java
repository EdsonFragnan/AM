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
@Table(name="GM_PAGAMENTO")
@SequenceGenerator(name="PagamentoSeq", sequenceName="SEQ_GM_PAGAMENTO", allocationSize=1)
public class Pagamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6976539791762385745L;


	public Pagamento() {
		super();
	}
	
	public Pagamento(int codigoPagamento, Pedido pedido, FormaPagamento forma, double valorPagamento, int parcelas) {
		super();
		this.codigoPagamento = codigoPagamento;
		this.pedido = pedido;
		this.forma = forma;
		this.valorPagamento = valorPagamento;
		this.parcelas = parcelas;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PagamentoSeq")
	@Column(name="CODIGO_PAGAMENTO")
	private int codigoPagamento;
	
	@JoinColumn(name="CODIGO_PEDIDO")
	@Column(name="CODIGO_PEDIDO", columnDefinition="NUMBER(8)")
	private Pedido pedido;
	
	@JoinColumn(name="CODIGO_FORMA")
	@Column(name="CODIGO_FORMA", columnDefinition="NUMBER(8)")
	private FormaPagamento forma;
	
	@Column(name="VALOR_PAGAMENTO", columnDefinition="NUMBER(     12.20)")
	private double valorPagamento;
	
	@Column(name="PARCELAS", columnDefinition="NUMBER(         2)")
	private int parcelas;
	
			
	public int getCodigoPagamento() {	
		return codigoPagamento;		
	}
	
	public void setCodigoPagamento(int codigoPagamento) {	
		this.codigoPagamento = codigoPagamento;		
	}	
		
	public Pedido getPedido() {	
		return pedido;		
	}
	
	public void setPedido(Pedido pedido) {	
		this.pedido = pedido;		
	}	
		
	public FormaPagamento getForma() {	
		return forma;		
	}
	
	public void setForma(FormaPagamento forma) {	
		this.forma = forma;		
	}	
		
	public double getValorPagamento() {	
		return valorPagamento;		
	}
	
	public void setValorPagamento(double valorPagamento) {	
		this.valorPagamento = valorPagamento;		
	}	
		
	public int getParcelas() {	
		return parcelas;		
	}
	
	public void setParcelas(int parcelas) {	
		this.parcelas = parcelas;		
	}	
	
}