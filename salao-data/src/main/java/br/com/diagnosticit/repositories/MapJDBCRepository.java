/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.repositories;

import br.com.diagnosticit.model.BaseEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author cristianoca
 */
public class MapJDBCRepository implements CrudRepository< BaseEntity, Long>{
    
    Map<Long, BaseEntity> map = new HashMap<>();

    @Override
    public List<BaseEntity> findAll() {
        List<BaseEntity> list = new ArrayList<>();
        for( Map.Entry value : map.entrySet() ){
            list.add((BaseEntity)value.getValue());           
        }
        return list;
    }

    @Override
    public BaseEntity findById(Long id) {
        return map.get(id);
    }

    @Override
    public BaseEntity save(BaseEntity object) {
        Long chave = map.size() + 1L;
        object.setId(chave);
        map.put( chave, object);
        return object;
    }

    @Override
    public void delete(BaseEntity object) {
        map.remove(object.getId());
    }

    @Override
    public void deleteById(Long id) {
        map.remove(id);
    }
    
}
