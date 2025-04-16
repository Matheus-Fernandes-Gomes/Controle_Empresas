package br.com.dsfs.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import br.com.dsfs.controller.schema.EmpresaReq;
import br.com.dsfs.model.Empresa;
import br.com.dsfs.model.Endereco;
import br.com.dsfs.repository.EmpresaRepository;
import jakarta.transaction.Transactional;

@Service
@Validated
public class EmpresaManager {

	@Autowired
	EmpresaRepository empresaRepository;

	@Transactional
	public Empresa createEmpresa(EmpresaReq req) {

		Endereco endereco = new Endereco(
				req.endereco().cep(), 
				req.endereco().rua(), 
				req.endereco().bairro(),
				req.endereco().numero(), 
				req.endereco().cidade(), 
				req.endereco().estado());

		Empresa empresa = new Empresa(
				req.cnpj(), 
				req.nome(), 
				req.email(), 
				req.qtdFuncionarios(), 
				req.tipo(),
				req.ramo(), 
				req.descricao(), 
				endereco

		);
		
		
		

		return empresaRepository.save(empresa);

	}
}