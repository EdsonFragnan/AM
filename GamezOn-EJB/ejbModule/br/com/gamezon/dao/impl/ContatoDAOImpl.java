package br.com.gamezon.dao.impl;

import javax.ejb.Stateless;
import br.com.gamezon.dao.ContatoDAO;
import br.com.gamezon.entity.Contato;

@Stateless
public class ContatoDAOImpl extends DAOImpl<Contato, Integer> implements ContatoDAO {

}