/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.model;

import br.com.diagnosticit.exceptions.DataInicialMaiorQueDataFinalException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

/**
 *
 * @author cristiano
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Privilegio extends BaseEntity{
    
    private Date dataInicial;
    private Date dataFinal;
    private boolean ativo;
     
    @JsonIgnore
    @ManyToOne
    private PublicadorBatizado publicadorBatizado;

    public Privilegio() {}
    
    public Privilegio(Date dataInicial, Date dataFinal, boolean ativo, 
            PublicadorBatizado publicadorBatizado) 
            throws DataInicialMaiorQueDataFinalException {       
        this(null, dataInicial, dataFinal, ativo, publicadorBatizado);
    }

    public Privilegio(Long id, Date dataInicial, Date dataFinal, boolean ativo, 
            PublicadorBatizado publicadorBatizado) 
            throws DataInicialMaiorQueDataFinalException {
        super(id);        
        
        if( dataInicial == null ){
            throw new IllegalArgumentException();
        }        
        if( dataFinal == null ){
            throw new IllegalArgumentException();
        }
        if( publicadorBatizado == null ){
            throw new IllegalArgumentException();
        }
        if( dataInicial.getTime() >= dataFinal.getTime() ){
            throw new DataInicialMaiorQueDataFinalException(
                "Data inicial deve ser menor que a data final");
        }
                
        this.dataInicial = dataInicial;
        this.dataFinal   = dataFinal;
        this.ativo       = ativo;
        this.publicadorBatizado = publicadorBatizado;
    }
       
    public Date getDataInicial() {
        return dataInicial;
    }

    /**
     * 
     * @param dataInicial
     * @throws DataInicialMaiorQueDataFinalException 
     */
    public void setDataInicial(Date dataInicial) throws 
            DataInicialMaiorQueDataFinalException {

        if( dataInicial == null ){
            throw new IllegalArgumentException("Data inicial obrigatorio");
        }
        if( dataFinal == null ){
            this.dataInicial = dataInicial;
        }
        else{
            if( dataInicial.getTime() >= dataFinal.getTime() ){
                throw new DataInicialMaiorQueDataFinalException(
                "Data inicial deve ser menor que a data final");
            }
            else{
                this.dataInicial = dataInicial;
            }
        }
    }

    /**
     * 
     * @return 
     */
    public Date getDataFinal() {
        return dataFinal;
    }

    /**
     * 
     * @param dataFinal
     * @throws DataInicialMaiorQueDataFinalException 
     */
    public void setDataFinal(Date dataFinal) throws 
            DataInicialMaiorQueDataFinalException {
        
        if( dataFinal == null ){
            throw new IllegalArgumentException("Data final obrigatorio");
        }
        
        if( dataInicial == null ){
            this.dataFinal = dataFinal;           
        }
        else{
            if( dataFinal.getTime() <= dataInicial.getTime() ){
                throw new DataInicialMaiorQueDataFinalException(
                    "Data inicial deve ser menor que a data final");
            }
            else{
                this.dataFinal = dataFinal;
            }
        }        
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

    /**
     * 
     * @param publicadorBatizado 
     */
    public void setPublicadorBatizado(PublicadorBatizado publicadorBatizado) {
        if( publicadorBatizado == null ){
            throw new IllegalArgumentException("Publicador batizado obrigatório");
        }
        this.publicadorBatizado = publicadorBatizado;
    }

    @Override
    public String toString() {
        return super.toString() + " Privilegio{" + "dataInicial=" + dataInicial +
                ", dataFinal=" + dataFinal + ", ativo=" + ativo +
                ", publicadorBatizado=" + publicadorBatizado + '}';
    }

    
    
}
