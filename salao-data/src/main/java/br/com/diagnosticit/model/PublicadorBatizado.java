/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 *
 * @author cristiano
 */
@Entity
public class PublicadorBatizado extends BaseEntity{
    
    private Date dataBatismo;
    
    private String local;
    
    @OneToOne
    private Pessoa pessoa;
 
    public PublicadorBatizado() {
    }

    public PublicadorBatizado(Date dataBatismo, String local, Pessoa pessoa) {
        this.dataBatismo = dataBatismo;
        this.local  = local;
        this.pessoa = pessoa;
    }

    public PublicadorBatizado(Date dataBatismo, String local, Pessoa pessoa, Long id) {
        super(id);
        this.dataBatismo = dataBatismo;
        this.local = local;
        this.pessoa = pessoa;
    }

    public Date getDataBatismo() {
        return dataBatismo;
    }

    public void setDataBatismo(Date dataBatismo) {
        this.dataBatismo = dataBatismo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "PublicadorBatizado{" + "dataBatismo=" + dataBatismo + ", local=" + local + ", pessoa=" + pessoa + '}';
    }
               
    
}
