package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.Telefone;

@Local
public interface TelefoneDAO extends DAO<Telefone, Integer> {

}