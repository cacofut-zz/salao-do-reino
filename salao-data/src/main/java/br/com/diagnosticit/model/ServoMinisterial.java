/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author cristiano
 */
@Entity
public class ServoMinisterial extends BaseEntity{
    
    @ManyToOne
    private Congregacao congregacao;
    
    @OneToOne
    private PublicadorBatizado publicadorBatizado;    
    private String tipo;

    public ServoMinisterial() {
    }

    public ServoMinisterial(Long id, Congregacao congregacao, PublicadorBatizado publicadorBatizado, String tipo) {
        super(id);
        this.congregacao = congregacao;
        this.publicadorBatizado = publicadorBatizado;
        this.tipo = tipo;
    }

    public Congregacao getCongregacao() {
        return congregacao;
    }

    public void setCongregacao(Congregacao congregacao) {
        this.congregacao = congregacao;
    }

    public PublicadorBatizado getPublicadorBatizado() {
        return publicadorBatizado;
    }

    public void setPublicadorBatizado(PublicadorBatizado publicadorBatizado) {
        this.publicadorBatizado = publicadorBatizado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ServoMinisterial{" + "congregacao=" + congregacao + ", publicadorBatizado=" + publicadorBatizado + ", tipo=" + tipo + '}';
    }
            
    
}
