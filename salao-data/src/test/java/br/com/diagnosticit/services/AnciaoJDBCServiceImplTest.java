/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.repositories.AnciaoJDBCRepositoryImpl;
import org.junit.Before;
import br.com.diagnosticit.repositories.AnciaoJDBCRepository;

/**
 *
 * @author cristianoca
 */
public class AnciaoJDBCServiceImplTest {    
    
    private AnciaoJDBCRepositoryImpl repository;
    private AnciaoJDBCServiceImpl service;
    
    @Before
    public void setup(){
        repository = new AnciaoJDBCRepositoryImpl();
        service    = new AnciaoJDBCServiceImpl(repository);
    }
    
    
    
}
