package br.com.dsfs.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

// Classe que representa a chave composta
@Embeddable
public class ChaveEmpresaContrato implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String empresacnpj; // Campo correspondente a EMPRESACNPJ
    private int contratocontrato; // Campo correspondente a CONTRATOCONTRATO

    // Construtor padrão
    public ChaveEmpresaContrato() {}

    // Construtor completo
    public ChaveEmpresaContrato(String empresacnpj, int contratocontrato) {
        this.empresacnpj = empresacnpj;
        this.contratocontrato = contratocontrato;
    }

    // Getters e Setters
    public String getEmpresacnpj() {
        return empresacnpj;
    }

    public void setEmpresacnpj(String empresacnpj) {
        this.empresacnpj = empresacnpj;
    }

    public int getContratocontrato() {
        return contratocontrato;
    }

    public void setContratocontrato(int contratocontrato) {
        this.contratocontrato = contratocontrato;
    }

    // equals e hashCode para comparação de objetos
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChaveEmpresaContrato that = (ChaveEmpresaContrato) o;
        return contratocontrato == that.contratocontrato && Objects.equals(empresacnpj, that.empresacnpj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empresacnpj, contratocontrato);
    }
}