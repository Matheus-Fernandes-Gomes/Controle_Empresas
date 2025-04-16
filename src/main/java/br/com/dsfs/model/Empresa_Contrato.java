package br.com.dsfs.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Empresa_Contrato {

    // Define a chave composta
    @EmbeddedId
    private ChaveEmpresaContrato id;

    // Relacionamento com a tabela Empresa
    @ManyToOne
    @JoinColumn(name = "EMPRESACNPJ", insertable = false, updatable = false) // Chave estrangeira
    private Empresa empresa;

    // Relacionamento com a tabela Contrato
    @ManyToOne
    @JoinColumn(name = "NUMEROCONTRATO", insertable = false, updatable = false) // Chave estrangeira
    private Contrato contrato;

    // Construtor padrão
    public Empresa_Contrato() {}

    // Construtor completo
    public Empresa_Contrato(ChaveEmpresaContrato id, Empresa empresa, Contrato contrato) {
        this.id = id;
        this.empresa = empresa;
        this.contrato = contrato;
    }

    // Getters e Setters
    public ChaveEmpresaContrato getId() {
        return id;
    }

    public void setId(ChaveEmpresaContrato id) {
        this.id = id;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
}