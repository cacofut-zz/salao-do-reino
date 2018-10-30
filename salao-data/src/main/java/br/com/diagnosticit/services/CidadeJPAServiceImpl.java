/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.model.Cidade;
import br.com.diagnosticit.services.exceptions.ObjectNotFoundException;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.diagnosticit.repositories.CidadeRepository;

/**
 *
 * @author cristiano
 */
@Service
@Profile("springdatajpa")
public class CidadeJPAServiceImpl implements CidadeService{

    @Autowired    
    private CidadeRepository cidadeRepository;
    
    @Override
    public Set<Cidade> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cidade findById(Long id) {
        Optional<Cidade> obejct = cidadeRepository.findById(id);
        return obejct.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado! Id: " 
                + id + ", Tipo: " + Cidade.class.getName()) );
    }

    @Override
    public Cidade save(Cidade object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Cidade object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
