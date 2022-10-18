package com.teste.teste.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
	private String body = null;

	public String consultarCep(String cep) {

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = null;
		try {
			request = HttpRequest.newBuilder().uri(new URI(String.format("https://api.postmon.com.br/v1/cep/%s", cep)))
					.GET().build();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}

		try {
			this.body = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		return this.body;

	}

}
