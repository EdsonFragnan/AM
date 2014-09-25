package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.Produto;

@Local
public interface ProdutoDAO extends DAO<Produto, Integer> {

}