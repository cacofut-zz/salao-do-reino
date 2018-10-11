/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import br.com.diagnosticit.enums.TipoPioneiro;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author cristiano
 */
@Entity
public class Pioneiro extends BaseEntity {
    
    @ManyToOne
    private Congregacao congregacao;
    
    @OneToOne
    private PublicadorBatizado publicadorBatizado;
    
    private Integer tipo;
    
    public Pioneiro() {
    }

    public Pioneiro(Congregacao congregacao, PublicadorBatizado publicador, TipoPioneiro tipo) {
        this.publicadorBatizado  = publicador;
        this.congregacao = congregacao;
        this.tipo        = tipo.getCodigo();
    }

    public PublicadorBatizado getPublicadorBatizado() {
        return publicadorBatizado;
    }

    public void setPublicadorBatizado(PublicadorBatizado publicadorBatizado) {
        this.publicadorBatizado = publicadorBatizado;
    }
   
    
    public Congregacao getCongregacao() {
        return congregacao;
    }

    public void setCongregacao(Congregacao congregacao) {
        this.congregacao = congregacao;
    }

    public TipoPioneiro getTipo() {
        return TipoPioneiro.toEnum(this.tipo);
    }

    public void setTipo(TipoPioneiro tipo) {
        this.tipo = tipo.getCodigo();
    }

    @Override
    public String toString() {
        return "Pioneiro{" + "congregacao=" + congregacao + ", publicadorBatizado=" + publicadorBatizado + ", tipo=" + tipo + '}';
    }

    
    
    
}
