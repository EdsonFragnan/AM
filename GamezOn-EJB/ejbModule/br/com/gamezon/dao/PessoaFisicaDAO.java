package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.PessoaFisica;

@Local
public interface PessoaFisicaDAO extends DAO<PessoaFisica, Integer> {

}