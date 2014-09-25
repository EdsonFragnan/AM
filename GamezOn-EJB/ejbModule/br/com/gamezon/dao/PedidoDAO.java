package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.Pedido;

@Local
public interface PedidoDAO extends DAO<Pedido, Integer> {

}