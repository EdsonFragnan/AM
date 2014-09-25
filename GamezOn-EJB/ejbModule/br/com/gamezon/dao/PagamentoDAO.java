package br.com.gamezon.dao;

import javax.ejb.Local;

import br.com.gamezon.entity.Pagamento;

@Local
public interface PagamentoDAO extends DAO<Pagamento, Integer> {

}