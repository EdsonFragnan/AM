package br.com.gamezon.dao.impl;

import javax.ejb.Stateless;
import br.com.gamezon.dao.EnderecoDAO;
import br.com.gamezon.entity.Endereco;

@Stateless
public class EnderecoDAOImpl extends DAOImpl<Endereco, Integer> implements EnderecoDAO {

}