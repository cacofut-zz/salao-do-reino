/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.resources;

import br.com.diagnosticit.model.Anciao;
import br.com.diagnosticit.repositories.AnciaoRepository;
import br.com.diagnosticit.services.AnciaoService;
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
@RequestMapping(value = "/ancioes")
public class AnciaoResource {
    
    @Autowired
    private AnciaoService anciaoService;
        
    @GetMapping
    public ResponseEntity<Set<Anciao>> listAll(){
        Set<Anciao> ancioes = anciaoService.findAll();
        return ResponseEntity.ok().body(ancioes);
        
    }
}
