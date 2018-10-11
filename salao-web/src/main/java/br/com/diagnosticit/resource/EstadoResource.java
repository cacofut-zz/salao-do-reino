/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.resource;

import br.com.diagnosticit.model.Estado;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cristiano
 */
@RestController
@RequestMapping(value = "/estado")
public class EstadoResource {    
       
    @GetMapping(value = "")
    public List<Estado> findEstado(){
        
        Estado estado1 = new Estado(1L, "São Paulo", "sp");
        Estado estado2 = new Estado(2L, "Rio de Janeiro", "rj");
        
        return Arrays.asList(estado1, estado2);
    }
    
}
