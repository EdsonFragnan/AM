package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.Cliente;

@Local
public interface ClienteDAO extends DAO<Cliente, Integer> {

}