/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author cristiano
 */
@Entity
public class EnderecoPessoa extends BaseEntity{
    
    @JsonIgnore
    @ManyToOne
    private Pessoa pessoa;
    
    @OneToOne
    @JoinColumn(unique = true)
    private Endereco endereco;

    public EnderecoPessoa() {
    }

    public EnderecoPessoa(Long id, Pessoa pessoa, Endereco endereco) {
        super(id);
        this.pessoa = pessoa;
        this.endereco = endereco;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
