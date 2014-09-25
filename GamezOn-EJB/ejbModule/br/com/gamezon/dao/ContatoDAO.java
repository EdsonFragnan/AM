package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.Contato;

@Local
public interface ContatoDAO extends DAO<Contato, Integer> {

}