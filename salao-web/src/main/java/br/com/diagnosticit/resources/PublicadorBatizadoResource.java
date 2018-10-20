/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.resources;

import br.com.diagnosticit.model.PublicadorBatizado;
import br.com.diagnosticit.repositories.PublicadorBatizadoRepository;
import br.com.diagnosticit.services.PublicadorBatizadoService;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cristiano
 */
@RestController
@RequestMapping(value = "/publicadoresBatizados")
public class PublicadorBatizadoResource {
    
    @Autowired
    private PublicadorBatizadoRepository publicadorBatizadoRepository;
    
    @Autowired
    private PublicadorBatizadoService publicadorBatizadoService;
    
    @GetMapping
    public ResponseEntity<Set<PublicadorBatizado>> findAll(){
        Set<PublicadorBatizado> publicadores = publicadorBatizadoService.findAll();
        return ResponseEntity.ok().body(publicadores);
    }
}
