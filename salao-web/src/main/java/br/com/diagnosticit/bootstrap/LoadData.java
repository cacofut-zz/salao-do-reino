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
import br.com.diagnosticit.model.ServoMinisterial;
import br.com.diagnosticit.repositories.AnciaoRepository;
import br.com.diagnosticit.repositories.BairroRepository;
import br.com.diagnosticit.repositories.CidadeRepository;
import br.com.diagnosticit.repositories.CongregacaoRepository;
import br.com.diagnosticit.repositories.EnderecoRepository;
import br.com.diagnosticit.repositories.EstadoRepository;
import br.com.diagnosticit.repositories.PessoaRepository;
import br.com.diagnosticit.repositories.PioneiroRepository;
import br.com.diagnosticit.repositories.PublicadorBatizadoRepository;
import br.com.diagnosticit.repositories.ServoMinisterialRepository;
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
    
    @Autowired
    private ServoMinisterialRepository servoMinisterialRepository;
    
    @Autowired
    private AnciaoRepository anciaoRepository;
    
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
        endereco2.setLogradouro("Rua quinze de abril");
        endereco2.setNumero("123");
        endereco2.setCep("00000000");
        endereco2.setComplemento("");
        endereco2.setBairro(bairro1);  
        
        Endereco endereco3 = new Endereco();
        endereco3.setLogradouro("Rua rodolfo lutze");
        endereco3.setNumero("124");
        endereco3.setCep("02020202");
        endereco3.setComplemento("");
        endereco3.setBairro(bairro1);  
        
        Endereco endereco4 = new Endereco();
        endereco4.setLogradouro("Rua herbert spencer");
        endereco4.setNumero("789");
        endereco4.setCep("01454525");
        endereco4.setComplemento("");
        endereco4.setBairro(bairro1);    
        
        
        Congregacao congregacao = new Congregacao();        
        congregacaoRepository.save( congregacao );        
        
        Pessoa p1 = new Pessoa("cristiano", "carvalho amaral");        
        Pessoa p2 = new Pessoa("Junior", "Menezes");
        p1.getEnderecos().add(endereco1);
        p1.getEnderecos().add(endereco2);
        endereco1.setPessoa(p1);
        endereco2.setPessoa(p1);
        p2.getEnderecos().add(endereco3);
        endereco3.setPessoa(p2);
        
        pessoaRepository  .saveAll(Arrays.asList( p1, p2 ));
        enderecoRepository.saveAll(Arrays.asList(endereco1, endereco2, endereco3, endereco4));
        
        
        PublicadorBatizado publicadorb1 = new PublicadorBatizado(new Date(), "Vargem grande", p1);
        PublicadorBatizado publicadorb2 = new PublicadorBatizado(new Date(), "Cesário Lange", p2);
        publicadorBatizadoRepository.saveAll(Arrays.asList(publicadorb1, publicadorb2));
        
        Pioneiro pioneiro1 = new Pioneiro(congregacao, publicadorb1, TipoPioneiro.PIONEIRO_REGULAR);
        pioneiroRepository.save(pioneiro1);
        
        ServoMinisterial servo1 = new ServoMinisterial(null, congregacao, publicadorb1, "Servo");
        servoMinisterialRepository.save(servo1);
        
        Anciao anciao1 = new Anciao(null, congregacao, publicadorb2, "Ancião");
        anciaoRepository.save(anciao1);

         
    }
    
}

