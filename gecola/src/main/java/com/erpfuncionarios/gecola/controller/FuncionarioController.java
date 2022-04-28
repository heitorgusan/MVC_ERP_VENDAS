package com.erpfuncionarios.gecola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.erpfuncionarios.gecola.model.FuncionarioModel;
import com.erpfuncionarios.gecola.repository.FuncionarioRepository;


@RestController
@RequestMapping("/funcionarios")
@CrossOrigin("*")

public class FuncionarioController {
	@Autowired
	FuncionarioRepository funcionarioRepository;
	
	@GetMapping
	public ResponseEntity<List<FuncionarioModel>>GetAll(){
		return ResponseEntity.ok(funcionarioRepository.findAll());
	
	}
	
	@GetMapping("/{nome}")
	public ResponseEntity<List<FuncionarioModel>> GetByNome(@PathVariable String nome){
		
		return ResponseEntity.ok(funcionarioRepository.findAllByNomeFuncionarioContainingIgnoreCase(nome));
		
	}
	
	
	@PostMapping
	public ResponseEntity<FuncionarioModel> post(@RequestBody FuncionarioModel funcionario){
		return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioRepository.save(funcionario));
	}
	
	@PutMapping
	public ResponseEntity<FuncionarioModel> put (@RequestBody FuncionarioModel funcionario){
		return ResponseEntity.status(HttpStatus.OK).body(funcionarioRepository.save(funcionario));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		funcionarioRepository.deleteById(id);
	}
	
	
}