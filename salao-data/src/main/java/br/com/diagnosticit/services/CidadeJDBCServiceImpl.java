/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.model.Cidade;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.diagnosticit.repositories.CidadeJDBCRepository;

/**
 *
 * @author cristiano
 */
@Service
@Profile("jdbc")
public class CidadeJDBCServiceImpl implements CidadeService{

    @Autowired    
    private CidadeJDBCRepository cidadeRepository;
    
    @Override
    public Set<Cidade> findAll() {
        throw null;
    }

    @Override
    public Cidade findById(Long id) {
        throw null;
    }

    @Override
    public Cidade save(Cidade object) {
        throw null;
    }

    @Override
    public void delete(Cidade object) {
        
    }

    @Override
    public void deleteById(Long id) {
        
    }
    
    
}
