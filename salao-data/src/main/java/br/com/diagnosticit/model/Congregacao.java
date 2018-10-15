/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    
    @JsonIgnore
    @OneToMany(mappedBy = "congregacao")
    private List<Publicador> publicadores = new ArrayList<>();
    private String nome;

    public Congregacao() {
    }

    public Congregacao(Long id, String nome) {
        super(id);     
        this.nome = nome;
    }

    public List<Publicador> getPublicadores() {
        return publicadores;
    }

    public void setPublicadores(List<Publicador> publicadores) {
        this.publicadores = publicadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
