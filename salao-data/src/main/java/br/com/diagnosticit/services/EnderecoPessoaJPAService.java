/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.model.EnderecoPessoa;
import br.com.diagnosticit.services.exceptions.ObjectNotFoundException;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.diagnosticit.repositories.EnderecoPessoaRepository;

/**
 *
 * @author cristiano
 */
@Service
@Profile("springdatajpa")
public class EnderecoPessoaJPAService implements EnderecoPessoaService{

    @Autowired    
    private EnderecoPessoaRepository enderecoPessoaRepository;
    
    @Override
    public Set<EnderecoPessoa> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EnderecoPessoa findById(Long id) {
        Optional<EnderecoPessoa> obejct = enderecoPessoaRepository.findById(id);
        return obejct.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado! Id: " 
                + id + ", Tipo: " + EnderecoPessoa.class.getName()) );
    }

    @Override
    public EnderecoPessoa save(EnderecoPessoa object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(EnderecoPessoa object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
