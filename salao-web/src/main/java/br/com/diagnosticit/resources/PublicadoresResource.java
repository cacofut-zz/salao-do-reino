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
import java.util.ArrayList;
import java.util.List;
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
    private PublicadorBatizadoRepository publicadorBatizadoRepository;
    @Autowired
    private PublicadorNaoBatizadoRepository publicadorNaoBatizadoRepository;
    
    @GetMapping
    public ResponseEntity<List<Object>> findAll(){
        
        List<PublicadorBatizado> publicadoresBatizados = 
                publicadorBatizadoRepository.findAll();
        
        List<PublicadorNaoBatizado> publicadoresNaoBatizado = 
                publicadorNaoBatizadoRepository.findAll();
        
        ArrayList<Object> publicadores = new ArrayList<>();
        
        publicadoresBatizados  .forEach( pb   -> publicadores.add(pb));
        publicadoresNaoBatizado.forEach( pbnb -> publicadores.add(pbnb));
        
        
        return ResponseEntity.ok().body(publicadores);
    }
}
