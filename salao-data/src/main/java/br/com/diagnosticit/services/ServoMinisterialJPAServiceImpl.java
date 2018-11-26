/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.model.ServoMinisterial;
import br.com.diagnosticit.services.exceptions.ObjectNotFoundException;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.diagnosticit.repositories.ServoMinisterialRepository;

/**
 *
 * @author cristiano
 */
@Service
@Profile("jpa")
public class ServoMinisterialJPAServiceImpl implements ServoMinisterialService{

    @Autowired    
    private ServoMinisterialRepository servoMinisterialRepository;
    
    @Override
    public Set<ServoMinisterial> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ServoMinisterial findById(Long id) {
        Optional<ServoMinisterial> obejct = servoMinisterialRepository.findById(id);
        return obejct.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado! Id: " 
                + id + ", Tipo: " + ServoMinisterial.class.getName()) );
    }

    @Override
    public ServoMinisterial save(ServoMinisterial object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(ServoMinisterial object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
