/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author cristiano
 */
@Entity
public class Publicador extends BaseEntity{
    
    private boolean ativo;
    private Date dataInicial;
    private Date dataFinal;
    
    @OneToOne
    private Pessoa pessoa;    
    
    @OneToOne
    private Congregacao congregacao;

    public Publicador() {
    }

    public Publicador(Long id, boolean ativo, Date dataInicial, Date dataFinal, Pessoa pessoa, Congregacao congregacao) {
        super(id);
        this.ativo = ativo;
        this.dataInicial = dataInicial;
        this.dataFinal   = dataFinal;
        this.pessoa = pessoa;
        this.congregacao = congregacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Congregacao getCongregacao() {
        return congregacao;
    }

    public void setCongregacao(Congregacao congregacao) {
        this.congregacao = congregacao;
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
