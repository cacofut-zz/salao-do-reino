/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.repositories;

import java.util.List;


/**
 *
 * @author cristianoca
 */
public interface CrudRepository <T, ID>{
    
    List<T> findAll();
    
    T findById( ID id );
    
    T save( T object );
    
    void delete( T object );
    
    void deleteById( ID id );
}
