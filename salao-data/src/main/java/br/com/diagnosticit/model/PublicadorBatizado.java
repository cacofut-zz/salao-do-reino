/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author cristiano
 */
@Entity
public class PublicadorBatizado extends Pessoa{
    
    private Date dataBatismo;

    public PublicadorBatizado() {
    }

    public PublicadorBatizado(Date dataBatismo, String nome, String sobrenome) {
        super(nome, sobrenome);
        this.dataBatismo = dataBatismo;
    }

    public PublicadorBatizado(Long id, Date dataBatismo, String nome, String sobrenome) {
        super(id, nome, sobrenome);
        this.dataBatismo = dataBatismo;
    }
            

    public Date getDataBatismo() {
        return dataBatismo;
    }

    public void setDataBatismo(Date dataBatismo) {
        this.dataBatismo = dataBatismo;
    }

    @Override
    public String toString() {
        return super.toString() + " PublicadorBatizado{" + "dataBatismo=" + dataBatismo + '}';
    }
    
     
   
    
}
