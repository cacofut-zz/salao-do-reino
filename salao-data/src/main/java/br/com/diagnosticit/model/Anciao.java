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
public class Anciao extends BaseEntity{
    
    private String anciao;
    
    @OneToOne
    private Pessoa pessoa;

    public String getAnciao() {
        return anciao;
    }

    public void setAnciao(String anciao) {
        this.anciao = anciao;
    }
    
    
}
