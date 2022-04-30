package com.erpfuncionarios.gecola.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.erpfuncionarios.gecola.model.VendasModel;
import com.erpfuncionarios.gecola.repository.VendasRepository;

@RestController
@RequestMapping("/vendas")
@CrossOrigin("*")
public class VendasController {
	@Autowired
	VendasRepository vendasRepository;
	
	@GetMapping
	public ResponseEntity<List<VendasModel>> GetAll(){
		return ResponseEntity.ok(vendasRepository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<VendasModel> post(@RequestBody VendasModel venda){
		return ResponseEntity.status(HttpStatus.CREATED).body(vendasRepository.save(venda));
	}

}