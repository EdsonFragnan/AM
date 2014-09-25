package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.Cidade;

@Local
public interface CidadeDAO extends DAO<Cidade, Integer> {

}