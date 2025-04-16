package br.com.dsfs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dsfs.controller.schema.EmpresaReq;
import br.com.dsfs.manager.EmpresaManager;
import br.com.dsfs.model.Empresa;
import jakarta.validation.Valid;

@RestController
@RequestMapping("empresa")
public class EmpresaController {
	
	@Autowired
	private EmpresaManager empresaManager;
	

	@PostMapping
	public ResponseEntity<String> createEmpresa(
			@Valid @RequestBody EmpresaReq req) {
		Empresa empresa = empresaManager.createEmpresa(req);
		return ResponseEntity.ok(empresa.getCnpj());
	}
	

}
