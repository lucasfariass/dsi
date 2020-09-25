package com.si.dsi.pessoa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.si.dsi.pessoa.dto.PessoaDTO;
import com.si.dsi.pessoa.service.PessoaService;


@RestController
@RequestMapping("/cs")
public class PessoaController {
	
	@Autowired
	private PessoaService service;
	
	@GetMapping
	public ResponseEntity<List<PessoaDTO>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PessoaDTO> getById(@PathVariable Integer id) {
		return ResponseEntity.ok(service.getById(id));
	}
	
	@PostMapping
	public ResponseEntity<PessoaDTO> add(@RequestBody PessoaDTO pessoaDTO) {
		return new ResponseEntity<PessoaDTO>(service.add(pessoaDTO), HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<PessoaDTO> update(@PathVariable Integer id, @RequestBody PessoaDTO pessoaDTO) {
		return new ResponseEntity<PessoaDTO>(service.update(id, pessoaDTO), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		service.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
