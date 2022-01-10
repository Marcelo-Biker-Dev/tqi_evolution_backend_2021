package com.marceloBikerDev.loanAppclient.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.marceloBikerDev.loanAppclient.model.Pessoa;
import com.marceloBikerDev.loanAppclient.service.PessoaService;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {
	
	@Autowired
	private PessoaService pessoaService;

	@PostMapping
	public void cadastraPessoa(@RequestBody Pessoa pessoa) {
		pessoaService.salvaPessoa(pessoa);
	}		
		
    @GetMapping
    public Iterable<Pessoa> listaTodasPessoas() {
        return pessoaService.encontraTodasPessoas();
    }

    @GetMapping("/{id}")
    public Optional<Pessoa> listaPessoaPorId(@PathVariable("id") String id) {
        return pessoaService.encontraPessoaPorId(id);
    }

    @GetMapping("/nome/{nome}")
    public Iterable<Pessoa> listaPessoaPorNome(@PathVariable("nome") String nome) {
        return pessoaService.encontraPessoaPorNome(nome);
    }

    @GetMapping("/cpf/{cpf}")
    public Iterable<Pessoa> listaPessoaPorCpf(@PathVariable("cpf") String cpf) {
        return pessoaService.encontraPessoaPorCpf(cpf);
    }
    
    @GetMapping("/email/{email}")
    public Iterable<Pessoa> listaPessoaPorEmail(@PathVariable("email") String email) {
    	return pessoaService.encontraPessoaPorEmail(email);
    }
    
    @GetMapping("/rg/{rg}")
    public Iterable<Pessoa> listaPessoaPorRg(@PathVariable("rg") String rg) {
    	return pessoaService.encontraPessoaPorRg(rg);
    }
    
    @DeleteMapping
    public void apagaTodasPessoas() {	
    	pessoaService.apagaTodasPessoas();
	}
    
    @DeleteMapping("/{id}")
    public void apagaPessoaPorId(@PathVariable("id") String id) {	
    	pessoaService.apagaPessoaPorId(id);
	}
    
    @DeleteMapping("/cpf/{cpf}")
    public void apagaPessoaPorCpf(@PathVariable("cpf") String cpf) {	
    	pessoaService.apagaPessoaPorCpf(cpf);
    }
}