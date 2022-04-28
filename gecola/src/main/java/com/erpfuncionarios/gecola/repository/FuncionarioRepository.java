package com.erpfuncionarios.gecola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.erpfuncionarios.gecola.model.FuncionarioModel;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel,Integer>{
	public List<FuncionarioModel>findAllByNomeFuncionarioContainingIgnoreCase(String nome);
}
