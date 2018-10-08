/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.enums;

/**
 *
 * @author cristiano
 */
public enum TipoPioneiro {
    
    PIONEIRO_REGULAR (1, "pioneiro regular"),
    PIONEIRO_AUXILIAR(2, "pioneiro regular"),
    PIONEIRO_ESPECIAL(3, "pioneiro regular");
    
    private final Integer codigo;
    private final String descricao;
    
    private TipoPioneiro(Integer codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
    
    public static TipoPioneiro toEnum( Integer codigo ){
        
        if( codigo == null ){
            return null;
        }
        
        for( TipoPioneiro tipo : TipoPioneiro.values() ){
            if(codigo.equals(tipo.getCodigo())){
                return tipo;
            }
        }
        
        throw new IllegalArgumentException("Id inválido " + codigo);
    }
    
}

