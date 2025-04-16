package br.com.dsfs.controller.schema;

import jakarta.validation.constraints.NotNull;

public record EnderecoReq(
		
		@NotNull String cep,
		@NotNull String rua,
		@NotNull String bairro,
		@NotNull Integer numero,		
		@NotNull String cidade,
		@NotNull String estado

		


		

) {
}
