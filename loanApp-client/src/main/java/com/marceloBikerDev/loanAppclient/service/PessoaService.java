package com.marceloBikerDev.loanAppclient.service;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marceloBikerDev.loanAppclient.model.Pessoa;
import com.marceloBikerDev.loanAppclient.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	Scanner aguardaDigitarInstrucao = new Scanner(System.in);
	
	public void salvaPessoa(final Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}
	
	public Iterable<Pessoa> encontraTodasPessoas() {
		return pessoaRepository.findAll();
	}
	
	public Optional<Pessoa> encontraPessoaPorId(String id) {
		return pessoaRepository.findById(id);
	}
	
    public Iterable<Pessoa> encontraPessoaPorNome( String nome) {
        return pessoaRepository.findByNome(nome);
    }

	public Iterable<Pessoa> encontraPessoaPorCpf(String cpf) {
		return pessoaRepository.findByCpf(cpf);
	}
	
	public Iterable<Pessoa> encontraPessoaPorEmail(String email) {
		return pessoaRepository.findByEmail(email);
	}
	
	public Iterable<Pessoa> encontraPessoaPorRg(String rg) {
		return pessoaRepository.findByRg(rg);
	}
	
	public void apagaTodasPessoas() {
		
		System.out.printf("Você está prestes a apagar TODAS pessoas cadastradas no sistema!\nDigite: Não - para cancelar o comando de apagar; Sim - para apagar\n");
		String simOuNao = aguardaDigitarInstrucao.next();			
		
		/*while ((! simOuNao.toUpperCase().equals("SIM")) || (! simOuNao.toUpperCase().equals("NÃO"))) {		
			System.out.printf("Digite NÃO, ou digite SIM:\nVocê está prestes a apagar TODAS pessoas cadastradas no sistema!\nDigite: Não - para cancelar o comando de apagar; Sim - para apagar\n");
			simOuNao = aguardaDigitarInstrucao.next();
		}*/
		
		if (simOuNao.toUpperCase().equals("SIM")) {
			pessoaRepository.deleteAll();
		} else {
			System.out.println("Comando apagar foi cancelado");
		}
	}
	
	public void apagaPessoaPorId(String id) {
		pessoaRepository.deleteById(id);
	}
	
	public void apagaPessoaPorCpf(String cpf) {
		pessoaRepository.deleteByCpf(cpf);
	}
}