package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.Funcionario;

@Local
public interface FuncionarioDAO extends DAO<Funcionario, Integer> {

}