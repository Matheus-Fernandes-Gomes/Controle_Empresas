package br.com.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class ImovelController {
	@GetMapping
	public ResponseEntity<String> findAll(){
		return ResponseEntity.ok("Olá Mundo!");
	}

}
