/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.model.Estado;
import java.util.List;



/**
 *
 * @author cristiano
 */
public interface EstadoService extends CrudService<Estado, Long>{

    public List<Estado> getEstados();
    //public Set<Estado> getEstados();
}
