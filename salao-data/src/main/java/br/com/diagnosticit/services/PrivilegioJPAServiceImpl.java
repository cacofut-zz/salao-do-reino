/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.model.Privilegio;
import br.com.diagnosticit.services.exceptions.ObjectNotFoundException;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.diagnosticit.repositories.PrivilegioRepository;
import java.util.HashSet;

/**
 *
 * @author cristiano
 */
@Service
@Profile("jpa")
public class PrivilegioJPAServiceImpl implements PrivilegioService{

    @Autowired    
    private PrivilegioRepository privilegioRepository;
    
    @Override
    public Set<Privilegio> findAll() {
        Set<Privilegio> privilegios = new HashSet<>();
        privilegioRepository.findAll().forEach(privilegios::add);
        return privilegios;
    }

    @Override
    public Privilegio findById(Long id) {
        Optional<Privilegio> obejct = privilegioRepository.findById(id);
        return obejct.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado! Id: " 
                + id + ", Tipo: " + Privilegio.class.getName()) );
    }

    @Override
    public Privilegio save(Privilegio object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Privilegio object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
