/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author cristianoca
 */
@Entity
public class Congregacao extends BaseEntity{
    
    private String nome;
    
    public Congregacao() {
        this("Default");
    }

    public Congregacao(String nome) {
        this.nome = nome;
    }

    public Congregacao(String nome, Long id) {
        super(id);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }                

    @Override
    public String toString() {
        return "Congregacao{" + "nome=" + nome + '}';
    }

                    
    
}
