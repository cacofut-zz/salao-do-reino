/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.resources;

import br.com.diagnosticit.model.Publicador;
import br.com.diagnosticit.model.PublicadorBatizado;
import br.com.diagnosticit.model.PublicadorNaoBatizado;
import br.com.diagnosticit.repositories.PublicadorBatizadoRepository;
import br.com.diagnosticit.repositories.PublicadorNaoBatizadoRepository;
import br.com.diagnosticit.repositories.PublicadorRepository;
import br.com.diagnosticit.services.PublicadorBatizadoService;
import br.com.diagnosticit.services.PublicadorNaoBatizadoService;
import java.util.ArrayList;
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
@RequestMapping(value = "/publicadores")
public class PublicadoresResource {
    
    @Autowired
    private PublicadorBatizadoService publicadorBatizadoService;
    @Autowired
    private PublicadorNaoBatizadoService publicadorNaoBatizadoService;
    
    @GetMapping
    public ResponseEntity<List<Object>> findAll(){
        
        Set<PublicadorBatizado> publicadoresBatizados = 
            publicadorBatizadoService.findAll();
        
        Set<PublicadorNaoBatizado> publicadoresNaoBatizado = 
            publicadorNaoBatizadoService.findAll();
        
        ArrayList<Object> publicadores = new ArrayList<>();
        
        publicadoresBatizados  .forEach(publicadores::add);
        publicadoresNaoBatizado.forEach(publicadores::add);        
        
        return ResponseEntity.ok().body(publicadores);
    }
}
