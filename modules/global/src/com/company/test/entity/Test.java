package com.company.test.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "TEST_TEST")
@Entity(name = "test_Test")
public class Test extends StandardEntity {
    private static final long serialVersionUID = -8714369817117382365L;

    @Column(name = "COGNOME", length = 100)
    private String cognome;

    @Column(name = "NOME", length = 100)
    private String nome;

    @Column(name = "INDIRIZZO", length = 100)
    private String indirizzo;

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}