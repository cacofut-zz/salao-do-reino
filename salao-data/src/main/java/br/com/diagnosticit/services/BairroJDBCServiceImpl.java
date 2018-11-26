/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.model.Bairro;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.diagnosticit.repositories.BairroJDBCRepository;

/**
 *
 * @author cristianoca
 */
@Service
@Profile("jdbc")
public class BairroJDBCServiceImpl implements CrudService<Bairro, Long>{

    @Autowired
    private BairroJDBCRepository anciaoRepository;
    
    @Override
    public Set<Bairro> findAll() {
        throw null;
    }

    @Override
    public Bairro findById(Long id) {
        throw null;
    }

    @Override
    public Bairro save(Bairro object) {
        throw null;
    }

    @Override
    public void delete(Bairro object) {
        
    }

    @Override
    public void deleteById(Long id) {
        
    }
    
}
