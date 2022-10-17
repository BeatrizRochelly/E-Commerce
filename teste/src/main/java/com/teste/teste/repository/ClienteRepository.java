package com.teste.teste.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teste.teste.model.ClienteModel;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {

	@Transactional(readOnly = true)
	ClienteModel findByEmail(String email);

	public Optional<ClienteModel> findByNome(String nome);

	public List<ClienteModel> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}
