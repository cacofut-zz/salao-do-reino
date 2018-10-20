/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.model.PublicadorBatizado;
import br.com.diagnosticit.services.exceptions.ObjectNotFoundException;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.diagnosticit.repositories.PublicadorBatizadoRepository;

/**
 *
 * @author cristiano
 */
@Service
@Profile("springdatajpa")
public class PublicadorBatizadoJPAService implements PublicadorBatizadoService{

    @Autowired    
    private PublicadorBatizadoRepository publicadorBatizadoRepository;
    
    @Override
    public Set<PublicadorBatizado> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PublicadorBatizado findById(Long id) {
        Optional<PublicadorBatizado> obejct = publicadorBatizadoRepository.findById(id);
        return obejct.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado! Id: " 
                + id + ", Tipo: " + PublicadorBatizado.class.getName()) );
    }

    @Override
    public PublicadorBatizado save(PublicadorBatizado object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(PublicadorBatizado object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
