/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author cristianoca
 */
@Entity
public class Bairro extends BaseEntity{
    
    private String nome;  
    
    @ManyToOne
    private Cidade cidade;

    public Bairro() {
    }

    public Bairro(String nome, Cidade cidade) {
        this.nome = nome;
        this.cidade = cidade;
    }

    public Bairro(String nome, Cidade cidade, Long id) {
        super(id);
        this.nome = nome;
        this.cidade = cidade;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    
}
