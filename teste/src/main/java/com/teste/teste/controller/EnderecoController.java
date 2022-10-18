package com.teste.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.teste.model.EnderecoModel;
import com.teste.teste.repository.EnderecoRepository;
import com.teste.teste.service.EnderecoService;

@RestController
@RequestMapping("/endereco")
@CrossOrigin("*")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	@GetMapping("/{cep}")
	public String buscarCep (@PathVariable String cep){
		return this.enderecoService.consultarCep(cep);
		
	}
	
	@PostMapping
	public ResponseEntity<EnderecoModel> postCep (@RequestBody EnderecoModel localidade) {
		return ResponseEntity.status(HttpStatus.CREATED).body(enderecoRepository.save(localidade));
	}
	
}
