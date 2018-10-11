/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

/**
 *
 * @author cristiano
 */

@Entity
public class Pessoa extends BaseEntity{
    
    private String nome;
    private String sobrenome;
    
    @OneToMany(mappedBy = "pessoa")
    private List<Endereco> enderecos = new ArrayList<>();

    public Pessoa() {
        
    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;

    }

    public Pessoa(Long id, String nome, String sobrenome) {
        super(id);
        this.nome = nome;
        this.sobrenome = sobrenome;

    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }        

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sobrenome=" + sobrenome + '}';
    }
      
    
}
