package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.Bairro;

@Local
public interface BairroDAO extends DAO<Bairro, Integer> {

}