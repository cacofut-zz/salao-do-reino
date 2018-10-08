/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.bootstrap;

import br.com.diagnosticit.enums.TipoPioneiro;
import br.com.diagnosticit.model.Anciao;
import br.com.diagnosticit.model.Bairro;
import br.com.diagnosticit.model.Cidade;
import br.com.diagnosticit.model.Congregacao;
import br.com.diagnosticit.model.Endereco;
import br.com.diagnosticit.model.Estado;
import br.com.diagnosticit.model.Pessoa;
import br.com.diagnosticit.model.Pioneiro;
import br.com.diagnosticit.model.PublicadorBatizado;
import br.com.diagnosticit.repositories.BairroRepository;
import br.com.diagnosticit.repositories.CidadeRepository;
import br.com.diagnosticit.repositories.CongregacaoRepository;
import br.com.diagnosticit.repositories.EnderecoRepository;
import br.com.diagnosticit.repositories.EstadoRepository;
import br.com.diagnosticit.repositories.PessoaRepository;
import br.com.diagnosticit.repositories.PioneiroRepository;
import br.com.diagnosticit.repositories.PublicadorBatizadoRepository;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
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
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private PessoaRepository pessoaRepository;
    @Autowired 
    private CongregacaoRepository congregacaoRepository;
    @Autowired
    private PublicadorBatizadoRepository publicadorBatizadoRepository;
    @Autowired
    private PioneiroRepository pioneiroRepository;
    
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
              
        
        Endereco endereco1 = new Endereco();
        endereco1.setLogradouro("Rua Ernest Renam");
        endereco1.setNumero("954");
        endereco1.setCep("05659020");
        endereco1.setComplemento("A");
        endereco1.setBairro(bairro1);  
        
        Endereco endereco2 = new Endereco();
        endereco2.setLogradouro("Rua Marioto Ferreira");
        endereco2.setNumero("1024");
        endereco2.setCep("05659020");
        endereco2.setComplemento("A");
        endereco2.setBairro(bairro1);  
        
        Congregacao congregacao = new Congregacao();
        
        congregacaoRepository.save( congregacao );
        enderecoRepository   .saveAll(Arrays.asList(endereco1, endereco2));
        
        PublicadorBatizado publicadorBatizado = new PublicadorBatizado(new Date(), "Cristiano", "carvalho amaral");
        publicadorBatizadoRepository.save(publicadorBatizado);
        
        Pioneiro pioneiro1 = new Pioneiro(congregacao, publicadorBatizado, TipoPioneiro.PIONEIRO_REGULAR);
        pioneiroRepository.save(pioneiro1);
       
        List<Pioneiro> pioneiros = pioneiroRepository.findAll();
        pioneiros.forEach( p -> System.out.println(p) );
         
    }
    
}

