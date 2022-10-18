package com.teste.teste.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.teste.teste.model.ClienteModel;
import com.teste.teste.model.EnderecoModel;
import com.teste.teste.repository.ClienteRepository;
import com.teste.teste.repository.EnderecoRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@SuppressWarnings("unused")
	private List<EnderecoModel> findEndereco(String email) {
		ClienteModel cliente = clienteRepository.findByEmail(email);
		List<EnderecoModel> enderecos = cliente.getEndereco();
		return enderecos;
	}

	public List<ClienteModel> getAll() {
		return clienteRepository.findAll();
	}

	public Optional<ClienteModel> getById(@PathVariable Long id) {
		return clienteRepository.findById(id);
	}
		

	public ClienteModel post(@Valid @RequestBody ClienteModel cliente) {
		return clienteRepository.save(cliente);
	}

	public ClienteModel put(@RequestBody ClienteModel cliente) {
		return clienteRepository.save(cliente);
	}

	public void delete(@PathVariable Long id) {
		clienteRepository.deleteById(id);

	}

	public ClienteModel save(ClienteModel clienteModel) {
		return clienteRepository.save(clienteModel);
	}

	public List<ClienteModel> findAll() {
		return clienteRepository.findAll();
	}


	@Transactional
	public ClienteModel adicionarEndereco(EnderecoModel enderecoModel, Long clienteId) {
		Optional<ClienteModel> clienteModel = clienteRepository.findById(clienteId);
		EnderecoModel endereco = enderecoRepository.save(enderecoModel);
		if (clienteModel.isPresent()) {
			List<EnderecoModel> enderecos = clienteModel.get().getEndereco();
			enderecos.add(endereco);

			clienteRepository.save(clienteModel.get());

		}
		return clienteModel.get();
	}
	
}