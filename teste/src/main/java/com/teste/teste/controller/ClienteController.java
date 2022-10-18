package com.teste.teste.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.teste.model.ClienteModel;
import com.teste.teste.model.EnderecoModel;
import com.teste.teste.service.ClienteService;

@RestController
@RequestMapping("/cliente")
@CrossOrigin("*")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping
	public ResponseEntity<List<ClienteModel>> getAll() {
		return ResponseEntity.ok(clienteService.findAll());
	}

	@GetMapping("/{id}")
	public Optional<ClienteModel> getById(@PathVariable Long id) {
		return clienteService.getById(id);
	}
	
	@PostMapping
	public ResponseEntity<ClienteModel> post(@Valid @RequestBody ClienteModel cliente) {
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.save(cliente));
	}

	@PutMapping
	public ResponseEntity<ClienteModel> put(@RequestBody ClienteModel cliente) {
		return ResponseEntity.status(HttpStatus.OK).body(clienteService.save(cliente));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		clienteService.delete(id);

	}

	@PostMapping("/{id}/enderecos")
	public ResponseEntity<ClienteModel> adicionarEndereco(@Valid @RequestBody EnderecoModel endereco,
			@PathVariable Long id) {
		return ResponseEntity.ok(clienteService.adicionarEndereco(endereco, id));
	}

}
