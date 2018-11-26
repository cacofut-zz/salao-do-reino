/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.model.Estado;
import br.com.diagnosticit.services.exceptions.ObjectNotFoundException;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.diagnosticit.repositories.EstadoRepository;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author cristiano
 */
@Service
@Profile("jpa")
public class EstadoJPAServiceImpl implements EstadoService{

    @Autowired    
    private EstadoRepository estadoRepository;

    public EstadoJPAServiceImpl() {
    }

    public EstadoJPAServiceImpl(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }
    
        
    @Override
    public Set<Estado> findAll() {
        Set<Estado> estados = new HashSet<>();
        estadoRepository.findAll().forEach(estados::add);
        return estados;
        
    }

    @Override
    public Estado findById(Long id) {
        Optional<Estado> obejct = estadoRepository.findById(id);
        return obejct.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado! Id: " 
                + id + ", Tipo: " + Estado.class.getName()) );
    }

    @Override
    public Estado save(Estado object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Estado object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    //public Set<Estado> getEstados() {
    public List<Estado> getEstados() {
        Set<Estado> estados = new HashSet<>();
        //estadoRepository.findAll().forEach(estados::add);
        return estadoRepository.findAll();
        //return estados;
    }
    
}
