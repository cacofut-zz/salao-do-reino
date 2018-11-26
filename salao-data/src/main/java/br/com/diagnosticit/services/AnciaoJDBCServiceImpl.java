/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.model.Anciao;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.diagnosticit.repositories.AnciaoJDBCRepository;

/**
 *
 * @author cristianoca
 */
@Service
@Profile("jdbc")
public class AnciaoJDBCServiceImpl implements CrudService<Anciao, Long>{

    @Autowired
    private AnciaoJDBCRepository anciaoRepository;

    public AnciaoJDBCServiceImpl() {
        
    }

    public AnciaoJDBCServiceImpl(AnciaoJDBCRepository anciaoRepository) {
        this.anciaoRepository = anciaoRepository;
    }
    
        
    @Override
    public Set<Anciao> findAll() {
        throw null;
    }

    @Override
    public Anciao findById(Long id) {
        throw null;
    }

    @Override
    public Anciao save(Anciao object) {
        throw null;
    }

    @Override
    public void delete(Anciao object) {
        
    }

    @Override
    public void deleteById(Long id) {
        
    }
    
}
