package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.FormaPagamento;

@Local
public interface FormaPagamentoDAO extends DAO<FormaPagamento, Integer> {

}