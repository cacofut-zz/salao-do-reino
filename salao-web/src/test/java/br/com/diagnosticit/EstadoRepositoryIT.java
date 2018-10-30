/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit;

import br.com.diagnosticit.model.Estado;
import br.com.diagnosticit.repositories.EstadoRepository;
import java.util.List;
import java.util.Optional;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 *
 * @author cristiano
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class EstadoRepositoryIT {
    
    @Autowired
    private EstadoRepository estadoRepository;
    
    @Before
    public void setUp() throws Exception{
        
    }
    
    @Test
    public void findByNome() throws Exception{               
        Optional<Estado> estadoOptional = estadoRepository.findByNome("são paulo");
        assertEquals("são paulo", estadoOptional.get().getNome());
    }
    
    @Test
    public void findBySigla() throws Exception{        
        Optional<Estado> estadoOptional = estadoRepository.findBySigla("rj");
        assertEquals("rj", estadoOptional.get().getSigla());
    }
    
}
