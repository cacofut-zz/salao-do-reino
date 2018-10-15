/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.resources;

import br.com.diagnosticit.model.Estado;
import br.com.diagnosticit.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cristiano
 */
@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {
    
    @Autowired
    private EstadoService estadoService;
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Estado> findById(@PathVariable Long id){
        Estado estado = estadoService.findById(id);
        return ResponseEntity.ok().body(estado);
    }
}
