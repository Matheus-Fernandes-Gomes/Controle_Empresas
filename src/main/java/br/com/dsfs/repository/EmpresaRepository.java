package br.com.dsfs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dsfs.model.Empresa;

public interface EmpresaRepository  extends JpaRepository <Empresa, String> {
	
	

}
