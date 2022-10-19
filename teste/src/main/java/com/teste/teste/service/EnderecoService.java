package com.teste.teste.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import com.teste.teste.model.ClienteModel;
import com.teste.teste.model.EnderecoModel;
import com.teste.teste.repository.ClienteRepository;

@Service
public class EnderecoService {
	private String body = null;

    @Autowired
    private ClienteRepository clienteRepository;

    public String consultarCep(String cep) throws URISyntaxException, IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = null;

        request = HttpRequest.newBuilder()
                .GET()
                .uri(new URI(String.format("https://api.postmon.com.br/v1/cep/%s", cep)))
                .build();

        return client.send(request, HttpResponse.BodyHandlers.ofString()).body();
    }

    public List<EnderecoModel> buscarEnderecoByEmail(String email) {
        List<EnderecoModel> enderecos = new ArrayList<>();
        ClienteModel cliente = clienteRepository.findByEmail(email);
        if (cliente != null) {
            enderecos = cliente.getEndereco();
        }
        return enderecos;
    }

}
