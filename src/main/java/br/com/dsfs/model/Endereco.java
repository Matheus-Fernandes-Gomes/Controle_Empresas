package br.com.dsfs.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ENDERECO")
    private Long id;

    @NotNull
    @Size(max = 9)
    @Pattern(regexp = "\\d{5}-\\d{3}", message = "CEP deve seguir o formato 12345-678")
    @Column(name = "CEP")
    private String cep;

    @Size(max = 255)
    @Column(name = "RUA")
    private String rua;

    @Size(max = 255)
    @Column(name = "BAIRRO")
    private String bairro;

    @Column(name = "NUMERO")
    private Integer numero;

    @NotNull
    @Size(max = 255)
    @Column(name = "CIDADE")
    private String cidade;

    @NotNull
    @Size(max = 255)
    @Column(name = "ESTADO")
    private String estado;

    // Construtor padrão
    public Endereco() {}

    // Construtor sem ID
    public Endereco(
        @NotNull @Size(max = 9) String cep,
        @Size(max = 255) String rua,
        @Size(max = 255) String bairro,
        Integer numero,
        @NotNull @Size(max = 255) String cidade,
        @NotNull @Size(max = 255) String estado
    ) {
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}