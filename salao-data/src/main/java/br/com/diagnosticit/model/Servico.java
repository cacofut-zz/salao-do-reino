/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author cristiano
 */
@Entity
public class Servico extends BaseEntity{
    
    @ManyToOne
    private Publicador publicador;
    
    private Date dataInicial;
    private Date dataFinal;

    public Servico() {
    }

    public Servico( Long id, Publicador publicador, Date dataInicial, Date dataFinal) {
        super(id);
        this.publicador = publicador;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public Publicador getPublicador() {
        return publicador;
    }

    public void setPublicador(Publicador publicador) {
        this.publicador = publicador;
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

    
    
    
}
