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
@Table(name="GM_FORMA_PAGAMENTO")
@SequenceGenerator(name="FormaPagamentoSeq", sequenceName="SEQ_GM_FORMA_PAGAMENTO", allocationSize=1)
public class FormaPagamento implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -242599240597550365L;


	public FormaPagamento() {
		super();
	}
	
	public FormaPagamento(int codigoForma, String descricao) {
		super();
		this.codigoForma = codigoForma;
		this.descricao = descricao;
		}	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="FormaPagamentoSeq")
	@Column(name="CODIGO_FORMA")
	private int codigoForma;
	
	@Column(name="DESCRICAO", length=30)
	private String descricao;
	
			
	public int getCodigoForma() {	
		return codigoForma;		
	}
	
	public void setCodigoForma(int codigoForma) {	
		this.codigoForma = codigoForma;		
	}	
		
	public String getDescricao() {	
		return descricao;		
	}
	
	public void setDescricao(String descricao) {	
		this.descricao = descricao;		
	}	
	
}