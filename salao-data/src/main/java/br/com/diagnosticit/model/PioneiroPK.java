/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author cristiano
 */
@Embeddable
public class PioneiroPK implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @OneToOne
    @JoinColumn(name = "publicador_id")
    private PublicadorBatizado publicadorBatizado;

    public PublicadorBatizado getPublicador() {
        return publicadorBatizado;
    }

    public void setPublicador(PublicadorBatizado publicador) {
        this.publicadorBatizado = publicador;
    }

    @Override
    public String toString() {
        return publicadorBatizado.toString();
    }
     
    
    
}
