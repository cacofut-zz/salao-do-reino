/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.controllers;

import br.com.diagnosticit.services.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author cristiano
 */
@Controller
@RequestMapping(value = "/estados")
public class EstadoController {
    
    @Autowired
    private EstadoService estadoService;

    public EstadoController() {
    }

    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }
            
    @GetMapping    
    public String estados(Model model){
        model.addAttribute("estados", estadoService.findAll());
        return "listar-estados";
    }
}
