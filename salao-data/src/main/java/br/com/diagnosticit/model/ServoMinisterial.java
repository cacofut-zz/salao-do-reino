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
public class ServoMinisterial extends BaseEntity{
    
    private String servoMinisterial;
    
    @OneToOne
    private Pessoa pessoa;

    public String getServoMinisterial() {
        return servoMinisterial;
    }

    public void setServoMinisterial(String servoMinisterial) {
        this.servoMinisterial = servoMinisterial;
    }
    
    
}
