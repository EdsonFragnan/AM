package br.com.gamezon.dao.impl;

import javax.ejb.Stateless;
import br.com.gamezon.dao.FuncionarioDAO;
import br.com.gamezon.entity.Funcionario;

@Stateless
public class FuncionarioDAOImpl extends DAOImpl<Funcionario, Integer> implements FuncionarioDAO {

}