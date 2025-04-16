package br.com.dsfs.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "CONTRATO")
public class Contrato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "NUMEROCONTRATO")
	private Integer contrato;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "ESPECIFICACAO")
	private String especificacao;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "CNPJFORNECEDOR")
	private Empresa cnpjfornecedor;



	public Integer getContrato() {
		return contrato;
	}


	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public Empresa getCnpjfornecedor() {
		return cnpjfornecedor;
	}

	public void setCnpjfornecedor(Empresa cnpjfornecedor) {
		this.cnpjfornecedor = cnpjfornecedor;
	}
	
	
	
	

}
