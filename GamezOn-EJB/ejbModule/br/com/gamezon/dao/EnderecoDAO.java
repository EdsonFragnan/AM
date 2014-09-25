package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.Endereco;

@Local
public interface EnderecoDAO extends DAO<Endereco, Integer> {

}