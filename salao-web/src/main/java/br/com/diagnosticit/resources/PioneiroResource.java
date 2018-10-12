/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.resources;

import br.com.diagnosticit.model.Pioneiro;
import br.com.diagnosticit.repositories.PioneiroRepository;
import java.util.List;
import java.util.Optional;
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
@RequestMapping(value = "/pioneiros")
public class PioneiroResource {

    @Autowired
    private PioneiroRepository pioneiroRepository;
    
    @GetMapping
    public ResponseEntity<List<Pioneiro>> findAll(){
        List<Pioneiro> pioneiros = pioneiroRepository.findAll();
        return ResponseEntity.ok().body(pioneiros);
    }
    
//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Pioneiro> find( @PathVariable Long id ){
//        Optional<Pioneiro> obj = pioneiroRepository.findById(id);
//        Pioneiro pioneiro = obj.orElseThrow( () -> new ObjectNot )
//    }
}
