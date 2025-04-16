package br.com.dsfs.controller.schema;

import jakarta.validation.constraints.NotNull;

public record ContratoReq(
		@NotNull 
		String especificacao,

		@NotNull 
		EmpresaReq fornecedor

) {

}
