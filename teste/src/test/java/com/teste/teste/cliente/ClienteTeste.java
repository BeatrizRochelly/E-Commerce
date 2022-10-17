package com.teste.teste.cliente;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.teste.teste.model.ClienteModel;

public class ClienteTeste {

	@Test
	public void testsetNome()
	{
		//Implementando método teste unitário: Nome
		ClienteModel c1 = new ClienteModel();
		c1.setNome ("Beatriz");
		assertEquals("Beatriz", c1.getNome());
		
	}
	
	
	@Test
	public void testsetEmail()
	{
		//Implementando método teste unitário: Email
		ClienteModel c1 = new ClienteModel();
		c1.setEmail("beatriz@email.com");
		assertEquals("beatriz@email.com", c1.getEmail());
		
	}
	
}
