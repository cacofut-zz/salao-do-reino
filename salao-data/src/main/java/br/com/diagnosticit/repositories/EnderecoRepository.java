/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.repositories;

import br.com.diagnosticit.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author cristiano
 */
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{
    
}