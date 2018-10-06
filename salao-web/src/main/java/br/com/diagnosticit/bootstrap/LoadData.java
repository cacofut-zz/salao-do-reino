/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.bootstrap;

import br.com.diagnosticit.model.Bairro;
import br.com.diagnosticit.model.Cidade;
import br.com.diagnosticit.model.Estado;
import br.com.diagnosticit.repositories.BairroRepository;
import br.com.diagnosticit.repositories.CidadeRepository;
import br.com.diagnosticit.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author cristianoca
 */
@Component
public class LoadData implements CommandLineRunner{

    @Autowired
    private EstadoRepository estadoRepository;
    @Autowired
    private CidadeRepository cidadeRepository;
    @Autowired
    private BairroRepository bairroRepository;
    
    @Override
    public void run(String... args) throws Exception {
        
        Estado estado1 = new Estado("são paulo", "sp");        
        Estado estado2 = new Estado("rio de janeiro", "rj");
        
        estadoRepository.save(estado1);
        estadoRepository.save(estado2);
        
        Cidade cidade1 = new Cidade("são paulo", estado1);
        cidade1.setEstado(estado1);
        
        cidadeRepository.save(cidade1);
        
        Bairro bairro1 = new Bairro("paraisópolis", cidade1);          
        bairroRepository.save(bairro1);
        
        
        
        
       
        
        
        
        
    }
    
}

