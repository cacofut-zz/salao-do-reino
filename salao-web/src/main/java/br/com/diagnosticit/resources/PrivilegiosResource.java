/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.resources;

import br.com.diagnosticit.model.Privilegio;
import br.com.diagnosticit.repositories.PrivilegioRepository;
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
@RequestMapping(value = "/privilegios")
public class PrivilegiosResource {
    
    @Autowired
    private PrivilegioRepository privilegioRepository;
    
    @GetMapping
    public ResponseEntity<List<Privilegio>> findAll(){        
        List<Privilegio> privilegios = privilegioRepository.findAll();
        return ResponseEntity.ok().body(privilegios);
    }

}
