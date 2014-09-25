package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.PessoaJuridica;

@Local
public interface PessoaJuridicaDAO extends DAO<PessoaJuridica, Integer> {

}