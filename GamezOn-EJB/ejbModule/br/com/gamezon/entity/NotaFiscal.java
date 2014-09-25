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
@Table(name="GM_NOTA_FISCAL")
@SequenceGenerator(name="NotaFiscalSeq", sequenceName="SEQ_GM_NOTA_FISCAL", allocationSize=1)
public class NotaFiscal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -901227661441819170L;


	public NotaFiscal() {
		super();
	}
	
	public NotaFiscal(int numeroNota, Pedido pedido, Calendar dataEmissao, char statusNota) {
		super();
		this.numeroNota = numeroNota;
		this.pedido = pedido;
		this.dataEmissao = dataEmissao;
		this.statusNota = statusNota;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="NotaFiscalSeq")
	@Column(name="NUMERO_NOTA")
	private int numeroNota;
	
	@JoinColumn(name="CODIGO_PEDIDO")
	@Column(name="CODIGO_PEDIDO", columnDefinition="NUMBER(8)")
	private Pedido pedido;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_EMISSAO")
	private Calendar dataEmissao;
	
	@Column(name="STATUS_NOTA", length=1)
	private char statusNota;
	
			
	public int getNumeroNota() {	
		return numeroNota;		
	}
	
	public void setNumeroNota(int numeroNota) {	
		this.numeroNota = numeroNota;		
	}	
		
	public Pedido getPedido() {	
		return pedido;		
	}
	
	public void setPedido(Pedido pedido) {	
		this.pedido = pedido;		
	}	
		
	public Calendar getDataEmissao() {	
		return dataEmissao;		
	}
	
	public void setDataEmissao(Calendar dataEmissao) {	
		this.dataEmissao = dataEmissao;		
	}	
		
	public char getStatusNota() {	
		return statusNota;		
	}
	
	public void setStatusNota(char statusNota) {	
		this.statusNota = statusNota;		
	}	
	
}