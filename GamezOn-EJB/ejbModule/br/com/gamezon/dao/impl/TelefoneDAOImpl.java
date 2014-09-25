package br.com.gamezon.dao.impl;


import javax.ejb.Stateless;
import br.com.gamezon.dao.TelefoneDAO;
import br.com.gamezon.entity.Telefone;

@Stateless
public class TelefoneDAOImpl extends DAOImpl<Telefone, Integer> implements TelefoneDAO {

}