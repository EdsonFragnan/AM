package br.com.gamezon.dao.impl;

import javax.ejb.Stateless;

import br.com.gamezon.dao.ClienteDAO;
import br.com.gamezon.entity.Cliente;

@Stateless
public class ClienteDAOImpl extends DAOImpl<Cliente, Integer> implements ClienteDAO {


}