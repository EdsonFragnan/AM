package br.com.gamezon.dao.impl;

import javax.ejb.Stateless;
import br.com.gamezon.dao.CidadeDAO;
import br.com.gamezon.entity.Cidade;

@Stateless
public class CidadeDAOImpl extends DAOImpl<Cidade, Integer> implements CidadeDAO {

}