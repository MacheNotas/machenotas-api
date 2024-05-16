package com.istpmache.macheNotas.repository;

import com.istpmache.macheNotas.model.entity.Secretario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecretarioRepository extends CrudRepository<Secretario, Long> {

}
