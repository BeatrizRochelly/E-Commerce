package com.teste.teste.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_clientes")
public class ClienteModel implements Serializable {
    private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O atributo nome é obrigatório!")
	private String nome;

	@NotNull(message = "O atributo Email é Obrigatório!")
	@Email(message = "O atributo Email deve ser um email válido!")
	private String email;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	// @JsonIgnoreProperties("cliente")
	private List<EnderecoModel> endereco = new ArrayList<>();

	public ClienteModel(Long id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;

	}

	public ClienteModel() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<EnderecoModel> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<EnderecoModel> endereco) {
		this.endereco = endereco;
	}

}
