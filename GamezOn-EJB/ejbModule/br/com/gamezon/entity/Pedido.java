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
@Table(name="GM_PEDIDO")
@SequenceGenerator(name="PedidoSeq", sequenceName="SEQ_GM_PEDIDO", allocationSize=1)
public class Pedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4791626046506543408L;


	public Pedido() {
		super();
	}
	
	public Pedido(int codigoPedido, Cliente cliente, Funcionario funcionario, Calendar dataEmissao, char statusPedido) {
		super();
		this.codigoPedido = codigoPedido;
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.dataEmissao = dataEmissao;
		this.statusPedido = statusPedido;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="PedidoSeq")
	@Column(name="CODIGO_PEDIDO")
	private int codigoPedido;
	
	@JoinColumn(name="CODIGO_CLIENTE")
	@Column(name="CODIGO_CLIENTE", columnDefinition="NUMBER(8)")
	private Cliente cliente;
	
	@JoinColumn(name="CODIGO_FUNCIONARIO")
	@Column(name="CODIGO_FUNCIONARIO", columnDefinition="NUMBER(8)")
	private Funcionario funcionario;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_EMISSAO")
	private Calendar dataEmissao;
	
	@Column(name="STATUS_PEDIDO", length=1)
	private char statusPedido;
	
			
	public int getCodigoPedido() {	
		return codigoPedido;		
	}
	
	public void setCodigoPedido(int codigoPedido) {	
		this.codigoPedido = codigoPedido;		
	}	
		
	public Cliente getCliente() {	
		return cliente;		
	}
	
	public void setCliente(Cliente cliente) {	
		this.cliente = cliente;		
	}	
		
	public Funcionario getFuncionario() {	
		return funcionario;		
	}
	
	public void setFuncionario(Funcionario funcionario) {	
		this.funcionario = funcionario;		
	}	
		
	public Calendar getDataEmissao() {	
		return dataEmissao;		
	}
	
	public void setDataEmissao(Calendar dataEmissao) {	
		this.dataEmissao = dataEmissao;		
	}	
		
	public char getStatusPedido() {	
		return statusPedido;		
	}
	
	public void setStatusPedido(char statusPedido) {	
		this.statusPedido = statusPedido;		
	}	
	
}