/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author cristiano
 */
@Entity
public class PublicadorNaoBatizado extends BaseEntity{
    
    private String tipo;
    
    @OneToOne
    private Publicador publicador;

    public PublicadorNaoBatizado() {
    }

    public PublicadorNaoBatizado(Long id, String tipo, Publicador publicador) {
        super(id);
        this.tipo = tipo;
        this.publicador = publicador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Publicador getPublicador() {
        return publicador;
    }

    public void setPublicador(Publicador publicador) {
        this.publicador = publicador;
    }
    
    
}
