package br.com.dsfs.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "EMPRESA")
public class Empresa {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "CNPJ")
	private String cnpj;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "NOME", unique=true)
	private String nome;
	
	@NotNull
	@Size(max = 255)
	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", message = "Formato de email inválido")
	@Column(name = "EMAIL", unique = true)
	private String email;
	
	@NotNull
	@Size(max = 10)
	@Column(name = "QTDFUNCIONARIOS")
	private Integer qtdFuncionarios;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "TIPO")
	private String tipo;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "RAMO")
	private String ramo;
	
	@NotNull
	@Size(max = 255)
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "ID_ENDERECO")
	private Endereco endereco;

	public Empresa(
			@NotNull String cnpj, 
			@NotNull @Size(max = 255) String nome, 
			@NotNull @Size(max = 255) String email,
			@NotNull @Size(max = 10) Integer qtdFuncionarios,
			@NotNull @Size(max = 255) String tipo,
			@NotNull @Size(max = 255) String ramo,
			@NotNull @Size(max = 255) String descricao,
			@NotNull Endereco endereco) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
		this.qtdFuncionarios = qtdFuncionarios;
		this.tipo = tipo;
		this.ramo = ramo;
		this.descricao = descricao;
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getQtdFuncionarios() {
		return qtdFuncionarios;
	}

	public void setQtdFuncionarios(Integer qtdFuncionarios) {
		this.qtdFuncionarios = qtdFuncionarios;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}


	
	

}
