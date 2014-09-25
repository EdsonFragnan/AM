package br.com.gamezon.dao.impl;


import javax.ejb.Stateless;
import br.com.gamezon.dao.TipoProdutoDAO;
import br.com.gamezon.entity.TipoProduto;

@Stateless
public class TipoProdutoDAOImpl extends DAOImpl<TipoProduto, Integer> implements TipoProdutoDAO {

}