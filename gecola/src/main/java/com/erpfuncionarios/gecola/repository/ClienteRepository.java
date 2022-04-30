package com.erpfuncionarios.gecola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erpfuncionarios.gecola.model.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel,Integer>{

	public List<ClienteModel> findAllByNomeClienteContainingIgnoreCase(String nome);
	
}