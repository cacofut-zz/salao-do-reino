/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author cristiano
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Privilegio extends BaseEntity{

    
    private Date dataInicial;
    private Date dataFinal;
    private boolean ativo;
     
    @JsonIgnore
    @ManyToOne
    private PublicadorBatizado publicadorBatizado;

    public Privilegio() {
    }

    public Privilegio(Long id, Date dataInicial, Date dataFinal, boolean ativo, 
            PublicadorBatizado publicadorBatizado) {
        super(id);
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
        this.ativo = ativo;
        this.publicadorBatizado = publicadorBatizado;
    }
   
    

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public PublicadorBatizado getPublicadorBatizado() {
        return publicadorBatizado;
    }

    public void setPublicadorBatizado(PublicadorBatizado publicadorBatizado) {
        this.publicadorBatizado = publicadorBatizado;
    }

    
}
