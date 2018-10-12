/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.resources;

import br.com.diagnosticit.model.ServoMinisterial;
import br.com.diagnosticit.repositories.ServoMinisterialRepository;
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
@RequestMapping(value = "/servosMinisteriais")
public class ServoMinisterialResource {
    
    @Autowired
    private ServoMinisterialRepository servoMinisterialRepository;
    
    @GetMapping
    public ResponseEntity<List<ServoMinisterial>> finAll(){
        List<ServoMinisterial> servos = servoMinisterialRepository.findAll();
        return ResponseEntity.ok().body(servos);
                
    }
}
