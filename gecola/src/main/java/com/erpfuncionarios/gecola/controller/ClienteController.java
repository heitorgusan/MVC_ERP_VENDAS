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

import com.erpfuncionarios.gecola.model.ClienteModel;
import com.erpfuncionarios.gecola.repository.ClienteRepository;

@RestController
@RequestMapping("clientes")
@CrossOrigin("*")
public class ClienteController {

	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping
	public ResponseEntity <List<ClienteModel>>GetAll(){
		return ResponseEntity.ok(clienteRepository.findAll());
	}

	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<ClienteModel>>GetByNome(@PathVariable String nome){
		
		return ResponseEntity.ok(clienteRepository.findAllByNomeClienteContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<ClienteModel> post(@RequestBody ClienteModel cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteRepository.save(cliente));
	}
	
	
	@PutMapping
	public ResponseEntity<ClienteModel>put (@RequestBody ClienteModel cliente){
		return ResponseEntity.status(HttpStatus.OK).body(clienteRepository.save(cliente));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		clienteRepository.deleteById(id);
	}
	
}