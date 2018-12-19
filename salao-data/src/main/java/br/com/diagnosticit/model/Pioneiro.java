/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import br.com.diagnosticit.enums.TipoPioneiro;
import br.com.diagnosticit.exceptions.DataInicialMaiorQueDataFinalException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
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
public class Pioneiro extends Privilegio{               
    
    private Integer tipo;
    
    public Pioneiro() {
    }

    public Pioneiro(Long id, TipoPioneiro tipo, Date dataInicial, Date dataFinal, 
            boolean ativo, PublicadorBatizado publicadorBatizado) throws DataInicialMaiorQueDataFinalException {
        super(id, dataInicial, dataFinal, ativo, publicadorBatizado);
        this.tipo = tipo.getCodigo();
    }        

    public TipoPioneiro getTipo() {
        return TipoPioneiro.toEnum(this.tipo);
    }

    public void setTipo(TipoPioneiro tipo) {
        this.tipo = tipo.getCodigo();
    }

    
    
}
