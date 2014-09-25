package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.ItemPedido;

@Local
public interface ItemPedidoDAO extends DAO<ItemPedido, Integer> {

}