/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.services;

import br.com.diagnosticit.model.PublicadorNaoBatizado;
import br.com.diagnosticit.services.exceptions.ObjectNotFoundException;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.diagnosticit.repositories.PublicadorNaoBatizadoRepository;
import java.util.HashSet;

/**
 *
 * @author cristiano
 */
@Service
@Profile("springdatajpa")
public class PublicadorNaoBatizadoJPAServiceImpl implements PublicadorNaoBatizadoService{

    @Autowired    
    private PublicadorNaoBatizadoRepository publicadorNaoBatizadoRepository;
    
    @Override
    public Set<PublicadorNaoBatizado> findAll() {
        Set<PublicadorNaoBatizado> publicadoresNaoBatizado = new HashSet<>();
        publicadorNaoBatizadoRepository.findAll().forEach(publicadoresNaoBatizado::add);
        return publicadoresNaoBatizado;
    }

    @Override
    public PublicadorNaoBatizado findById(Long id) {
        Optional<PublicadorNaoBatizado> obejct = publicadorNaoBatizadoRepository.findById(id);
        return obejct.orElseThrow( () -> new ObjectNotFoundException("Objeto não encontrado! Id: " 
                + id + ", Tipo: " + PublicadorNaoBatizado.class.getName()) );
    }

    @Override
    public PublicadorNaoBatizado save(PublicadorNaoBatizado object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(PublicadorNaoBatizado object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
