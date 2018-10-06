/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author cristianoca
 */
@Entity
public class Congregacao extends BaseEntity{
    
    @OneToOne
    private Endereco enderco;
    
    @OneToMany(mappedBy = "congregacao")
    private List<Anciao> anciaos;
    
    @OneToMany(mappedBy = "congregacao")
    private List<Publicador> publicadores;
    
    @OneToMany(mappedBy = "congregacao")
    private List<ServoMinisterial> servosMinisteriais;
    
}
