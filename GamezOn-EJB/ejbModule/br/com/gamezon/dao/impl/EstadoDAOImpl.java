package br.com.gamezon.dao.impl;

import javax.ejb.Stateless;
import br.com.gamezon.dao.EstadoDAO;
import br.com.gamezon.entity.Estado;

@Stateless
public class EstadoDAOImpl extends DAOImpl<Estado, Integer> implements EstadoDAO {

}