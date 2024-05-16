package com.istpmache.macheNotas.controller;

import com.istpmache.macheNotas.model.entity.Secretario;
import com.istpmache.macheNotas.service.SecretarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/secretarios")
public class SecretarioController {

    @Autowired
    SecretarioService secretarioService;

    @GetMapping()
    public List<Secretario> obtenerSecretarios(){
        return secretarioService.obtenerSecretarios();
    }

    @PostMapping()
    public Secretario guardarSecretario(@RequestBody Secretario secretario){
        return this.secretarioService.guardarSecretario(secretario);
    }
}
