package com.marceloBikerDev.loanAppclient.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.marceloBikerDev.loanAppclient.model.Pessoa;

public interface PessoaRepository extends ElasticsearchRepository<Pessoa, String> {
	
	
	Iterable<Pessoa> findByNome(String nome);

	Iterable<Pessoa> findByCpf(String cpf);
	
	Iterable<Pessoa> findByEmail(String email);
	
	Iterable<Pessoa> findByRg(String rg);
	
	Iterable<Pessoa> deleteByCpf(String cpf);
	
}