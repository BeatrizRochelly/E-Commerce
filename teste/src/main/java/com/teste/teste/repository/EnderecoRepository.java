package com.teste.teste.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.teste.teste.model.EnderecoModel;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoModel, Long>{

	public Optional<EnderecoModel> findByCep(String cep);
	public List <EnderecoModel> findAllByLocalidadeContainingIgnoreCase(@Param("localidade") String localidade);
	 

}
