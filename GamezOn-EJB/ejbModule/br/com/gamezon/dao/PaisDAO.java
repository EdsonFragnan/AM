package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.Pais;

@Local
public interface PaisDAO extends DAO<Pais, Integer> {

}