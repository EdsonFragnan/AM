package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.Estado;

@Local
public interface EstadoDAO extends DAO<Estado, Integer> {

}