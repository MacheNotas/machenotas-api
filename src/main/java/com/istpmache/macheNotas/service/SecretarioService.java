package com.istpmache.macheNotas.service;

import com.istpmache.macheNotas.model.entity.Secretario;
import com.istpmache.macheNotas.repository.SecretarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecretarioService {

    @Autowired
    SecretarioRepository secretarioRepository;

    public List<Secretario> obtenerSecretarios(){
        return (List<Secretario>) secretarioRepository.findAll();
    }

    public Secretario guardarSecretario(Secretario secretario){
        return secretarioRepository.save(secretario);
    }
}
