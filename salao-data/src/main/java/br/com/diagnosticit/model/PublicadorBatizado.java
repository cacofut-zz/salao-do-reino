/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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
    private Publicador publicador;
    
    @JsonIgnore
    @OneToMany(mappedBy = "publicadorBatizado")
    private List<Privilegio> privilegios = new ArrayList<>();
        
    public PublicadorBatizado() {
    }

    public PublicadorBatizado(Long id, Date dataBatismo, String local, Publicador publicador) {
        super(id);
        this.dataBatismo = dataBatismo;
        this.local = local;
        this.publicador = publicador;
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

    public Publicador getPublicador() {
        return publicador;
    }

    public void setPublicador(Publicador publicador) {
        this.publicador = publicador;
    }

    public List<Privilegio> getPrivilegios() {
        return privilegios;
    }

    public void setPrivilegios(List<Privilegio> privilegios) {
        this.privilegios = privilegios;
    }
    
}
