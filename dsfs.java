package br.com.dsfs.model;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "EMPRESA_CONTRATO")
public class Empresa_Contrato {
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "CNPJEMPRESA")
	private Empresa cnpjempresa;

	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "NUMEROCONTRATO")
	private Contrato numerocontrato;

}
