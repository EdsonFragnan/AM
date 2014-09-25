package br.com.gamezon.bean;

import java.io.Serializable;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;

//import br.com.gamezon.dao.PedidoDAO;
//import br.com.gamezon.entity.Pedido;

@ManagedBean
@SessionScoped
public class PedidoBean implements Serializable {

	//private Pedido pedido;
	
	//@EJB
	//private PedidoDAO dao;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4156211513388501771L;

	@PostConstruct
	private void init() {
		
		//pedido = new Pedido();
		//listaPedidos = dao.list();
	}
	
	//private List<Pedido> listaPedidos;
	
}
