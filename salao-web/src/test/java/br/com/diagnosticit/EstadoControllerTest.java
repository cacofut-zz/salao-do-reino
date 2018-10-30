/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit;

import br.com.diagnosticit.controllers.EstadoController;
import br.com.diagnosticit.model.Estado;
import br.com.diagnosticit.services.EstadoService;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.mockito.Mock;
import static org.junit.Assert.*;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
/**
 *
 * @author cristiano
 */
public class EstadoControllerTest {
    
    @Mock
    private EstadoService estadoService;
    
    @Mock
    private Model model;
    
    private EstadoController estadoController;
    
    @Before
    public void setUp() throws Exception{
        MockitoAnnotations.initMocks(this);
        estadoController = new EstadoController(estadoService);
    }
    
    @Test
    public void testMockMVC() throws Exception{

        
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(estadoController).build();
        
        mockMvc.perform(get("/estados"))
            .andExpect(status().isOk())
            .andExpect(view().name("listar-estados"));
    }
    
    @Test
    public void getEstadoPage(){
        
        Estado estado1 = new Estado(1L, "são paulo", "sp");
        Estado estado2 = new Estado(2L, "rio de janeiro", "rj");
        Set<Estado> estadosData = new HashSet<>();
        estadosData.addAll(Arrays.asList(estado1, estado2));
        
        when(estadoService.findAll()).thenReturn(estadosData);
        
        ArgumentCaptor<Set<Estado>> argumentCaptor = ArgumentCaptor.forClass(Set.class);
        
        assertEquals("listar-estados", estadoController.estados(model));
        
        verify( estadoService, times(1) ).findAll();
        verify( model, times(1) ).addAttribute(eq("estados"), argumentCaptor.capture());
        
        assertEquals(2, estadoService.findAll().size());
    }
}
