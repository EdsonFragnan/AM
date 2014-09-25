package br.com.gamezon.dao.impl;


import javax.ejb.Stateless;
import br.com.gamezon.dao.PedidoDAO;
import br.com.gamezon.entity.Pedido;

@Stateless
public class PedidoDAOImpl extends DAOImpl<Pedido, Integer> implements PedidoDAO {

}