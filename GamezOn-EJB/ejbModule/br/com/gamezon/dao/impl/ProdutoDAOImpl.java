package br.com.gamezon.dao.impl;


import javax.ejb.Stateless;
import br.com.gamezon.dao.ProdutoDAO;
import br.com.gamezon.entity.Produto;

@Stateless
public class ProdutoDAOImpl extends DAOImpl<Produto, Integer> implements ProdutoDAO {

}