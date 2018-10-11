/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 *
 * @author cristiano
 */
@Entity
public class Endereco extends BaseEntity {
    
    private String logradouro;
    private String numero;
    private String cep;
    private String complemento;
    
    @JsonIgnore
    @ManyToOne
    private Pessoa pessoa;
    
    @ManyToOne
    private Bairro bairro;

    public Endereco() {
    }

    public Endereco(String logradouro, String numero, String cep, String complemento, Bairro bairro) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    public Endereco(String logradouro, String numero, String cep, String complemento, Bairro bairro, Long id) {
        super(id);
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }    

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Bairro getBairro() {
        return bairro;
    }

    public void setBairro(Bairro bairro) {
        this.bairro = bairro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
     
    
   
}
