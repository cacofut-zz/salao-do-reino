/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit;

import br.com.diagnosticit.model.Estado;
import br.com.diagnosticit.repositories.EstadoRepository;
import br.com.diagnosticit.services.EstadoJPAServiceImpl;
import br.com.diagnosticit.services.EstadoService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 *
 * @author cristiano
 */

public class EstadoServiceTest {
    
    private EstadoService estadoService;
    
    @Mock
    private EstadoRepository estadoRepository;
    
    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
        estadoService = new EstadoJPAServiceImpl(estadoRepository);
    }
    
    @Test
    public void getRecipes(){
        
        Estado estado    = new Estado(1L, "são paulo", "sp");
        List estadosData = new ArrayList();        
        //Set estadosData = new HashSet();        
        estadosData.add(estado);
        
        when(estadoService.getEstados()).thenReturn(estadosData);
        
        List<Estado> estados = estadoService.getEstados();
        //Set<Estado> estados = estadoService.getEstados();
        assertEquals(1, estados.size());
        verify(estadoRepository, times(1)).findAll();
        
    }
}
