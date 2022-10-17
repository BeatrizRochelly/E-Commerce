package com.teste.teste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.teste.service.EnderecoService;

@RestController
@RequestMapping("/endereco")
@CrossOrigin("*")
public class EnderecoController {

	@Autowired
	private EnderecoService enderecoService;
	
	
	
	@GetMapping
	public String buscarCep () throws Exception {
		return this.enderecoService.consultarCep();
		
	}
	

	
}
