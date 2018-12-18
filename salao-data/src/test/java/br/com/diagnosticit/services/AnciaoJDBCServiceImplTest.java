/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.model.Anciao;
import org.junit.Before;
import br.com.diagnosticit.repositories.MapJDBCRepository;
import java.util.Date;
import java.util.Set;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 *
 * @author cristianoca
 */
public class AnciaoJDBCServiceImplTest {    
    
    private MapJDBCRepository repository;
    private AnciaoJDBCServiceImpl service;
    
    @Before
    public void setup(){
        repository = new MapJDBCRepository();
        service    = new AnciaoJDBCServiceImpl(repository);
    }
    
    @Test
    public void deve_salvar_anciao(){
        
        //cenário
        Anciao anciao = new Anciao();
        anciao.setAtivo(true);
        anciao.setDataInicial( new Date());
        anciao.setDataFinal  ( new Date());
        anciao.setTipo("Ancião");
        anciao.setPublicadorBatizado(null);
        
        //ação
        service.save(anciao);
        long chave = anciao.getId();        
        
        //resultado
        assertNotEquals(0, chave);
        
        
    }
    
    @Test
    public void deve_deletar_um_anciao(){
        
        //cenário
        Anciao anciao = new Anciao();
        anciao.setAtivo(true);
        anciao.setDataInicial( new Date());
        anciao.setDataFinal  ( new Date());
        anciao.setTipo("Ancião");
        anciao.setPublicadorBatizado(null);
        
        //ação
        service.save(anciao);
        long chave = anciao.getId();
        
        service.delete(anciao);
        Anciao newAnciao = service.findById(chave);
        
        //resultado
        assertNull(newAnciao);
        
    }
    
    @Test
    public void deve_buscar_um_anciao(){
        
        //cenário
        Anciao anciao = new Anciao();
        anciao.setAtivo(true);
        anciao.setDataInicial( new Date());
        anciao.setDataFinal  ( new Date());
        anciao.setTipo("Ancião");
        anciao.setPublicadorBatizado(null);
        
        //ação
        service.save(anciao);
        long chave = anciao.getId();
                
        Anciao newAnciao = service.findById(chave);        
        
        //resultado
        assertNotNull(newAnciao);
        
    }
    
    @Test
    public void deve_trazer_todos_os_anciaos(){
        
        //cenário
        Anciao anciao = new Anciao();
        anciao.setAtivo(true);
        anciao.setDataInicial( new Date());
        anciao.setDataFinal  ( new Date());
        anciao.setTipo("Ancião");
        anciao.setPublicadorBatizado(null);
        
        Anciao anciao1 = new Anciao();
        anciao1.setAtivo(true);
        anciao1.setDataInicial( new Date());
        anciao1.setDataFinal  ( new Date());
        anciao1.setTipo("Ancião");
        anciao1.setPublicadorBatizado(null);
        
        //ação
        service.save(anciao);
        service.save(anciao1);
        
        Set list = service.findAll();
        
        assertEquals(2, list.size());
        
        
        
    }
    
    
    
}
