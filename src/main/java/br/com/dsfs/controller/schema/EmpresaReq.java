package br.com.dsfs.controller.schema;

import jakarta.validation.constraints.NotNull;

public record EmpresaReq(
		@NotNull
		String cnpj,
		
		@NotNull
		String descricao,
		
		@NotNull
		String email,
		
		@NotNull
		String nome,
		
		@NotNull
		Integer qtdFuncionarios,
		
		@NotNull
		String ramo,
		
		@NotNull
		String tipo,
		
		@NotNull
		EnderecoReq endereco
		
		
		
		
		
		) {

}
