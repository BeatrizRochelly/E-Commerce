package com.teste.teste.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
	private String body = null;

	public String consultarCep() throws Exception {

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://api.postmon.com.br/v1/cep/53525600")).GET()
				.build();

		client.sendAsync(request, HttpResponse.BodyHandlers.ofString()).thenApply(response -> response.body())
				.thenAccept(response -> {
					this.body = response;
				});

		System.out.println(this.body);

		return this.body;

	}

}
