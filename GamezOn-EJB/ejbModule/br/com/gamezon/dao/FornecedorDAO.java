package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.Fornecedor;

@Local
public interface FornecedorDAO extends DAO<Fornecedor, Integer> {

}