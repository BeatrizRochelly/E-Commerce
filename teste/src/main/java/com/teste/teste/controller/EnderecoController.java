package com.teste.teste.controller;

import java.io.IOException;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teste.teste.model.EnderecoModel;
import com.teste.teste.repository.EnderecoRepository;
import com.teste.teste.service.EnderecoService;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/endereco")
@CrossOrigin("*")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	 @GetMapping(value = "/{cep}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<String> buscarCep(@PathVariable String cep) throws URISyntaxException, IOException, InterruptedException {
	        return ResponseEntity.ok(this.enderecoService.consultarCep(cep));

	    }

	    @GetMapping("/buscar_por")
	    public ResponseEntity<?> buscarEnderecosByEmail(@RequestParam String email) {
	        return ResponseEntity.ok(enderecoService.buscarEnderecoByEmail(email));
	    }

	
	@PostMapping
	public ResponseEntity<EnderecoModel> postCep (@RequestBody EnderecoModel localidade) {
		return ResponseEntity.status(HttpStatus.CREATED).body(enderecoRepository.save(localidade));
	}
	
}
