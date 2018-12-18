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
import br.com.diagnosticit.repositories.CrudRepository;
import java.util.HashSet;

/**
 *
 * @author cristianoca
 */
@Service
@Profile("jdbc")
public class AnciaoJDBCServiceImpl implements CrudService<Anciao, Long>{

    @Autowired
    private CrudRepository anciaoRepository;

    public AnciaoJDBCServiceImpl() {
        
    }

    public AnciaoJDBCServiceImpl(CrudRepository anciaoRepository) {
        this.anciaoRepository = anciaoRepository;
    }
    
        
    @Override
    public Set<Anciao> findAll() {
        Set list = new HashSet(anciaoRepository.findAll());
        return list;
    }

    @Override
    public Anciao findById(Long id) {
        return (Anciao) anciaoRepository.findById(id);
    }

    @Override
    public Anciao save(Anciao anciao) {
        return (Anciao) anciaoRepository.save(anciao);
    }

    @Override
    public void delete(Anciao anciao) {
        anciaoRepository.delete(anciao);
    }

    @Override
    public void deleteById(Long id) {
        
    }
    
}
