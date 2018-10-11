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
    private List<Pioneiro> pioneiros = new ArrayList<>();
    
    @JsonIgnore
    @OneToMany(mappedBy = "congregacao")
    private List<Anciao> anciaos = new ArrayList<>();
    
    @JsonIgnore
    @OneToMany(mappedBy = "congregacao")
    private List<ServoMinisterial> servosMinisteriais = new ArrayList<>();
    
    private String nome;
    
    public Congregacao() {
        this("Default");
    }

    public Congregacao(String nome) {
        this.nome = nome;
    } 

    public Congregacao(Long id, String nome) {
        super(id);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }        

    public List<Pioneiro> getPioneiros() {
        return pioneiros;
    }

    public void setPioneiros(List<Pioneiro> pioneiros) {
        this.pioneiros = pioneiros;
    }

    public List<Anciao> getAnciaos() {
        return anciaos;
    }

    public void setAnciaos(List<Anciao> anciaos) {
        this.anciaos = anciaos;
    }

    public List<ServoMinisterial> getServosMinisteriais() {
        return servosMinisteriais;
    }

    public void setServosMinisteriais(List<ServoMinisterial> servosMinisteriais) {
        this.servosMinisteriais = servosMinisteriais;
    }
    
                    
    
}
