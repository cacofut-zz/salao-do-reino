/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.model.Pessoa;
import br.com.diagnosticit.services.exceptions.ObjectNotFoundException;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.diagnosticit.repositories.PessoaRepository;

/**
 *
 * @author cristiano
 */
@Service
@Profile("springdatajpa")
public class PessoaJPAServiceImpl implements PessoaService{

    @Autowired    
    private PessoaRepository pessoaRepository;
    
    @Override
    public Set<Pessoa> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pessoa findById(Long id) {
        Optional<Pessoa> obejct = pessoaRepository.findById(id);
        return obejct.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado! Id: " 
                + id + ", Tipo: " + Pessoa.class.getName()) );
    }

    @Override
    public Pessoa save(Pessoa object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Pessoa object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
