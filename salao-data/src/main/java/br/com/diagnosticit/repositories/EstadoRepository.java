/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.repositories;

import br.com.diagnosticit.model.Estado;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cristianoca
 */
@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{
   
    Optional<Estado> findByNome(String nome);
    
    Optional<Estado> findBySigla(String sigla);
    
}
