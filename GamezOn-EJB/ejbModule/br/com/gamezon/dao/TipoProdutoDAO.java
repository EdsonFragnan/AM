package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.TipoProduto;

@Local
public interface TipoProdutoDAO extends DAO<TipoProduto, Integer> {

}