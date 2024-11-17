package br.grupointegrado.lanches.controllers;

import br.grupointegrado.lanches.models.Cliente;
import br.grupointegrado.lanches.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;
    @GetMapping
    public List<Cliente> findall(){
        return this.repository.findAll();
    }
    @GetMapping("/{id}")
    public Cliente findById(@PathVariable Integer id){
        return this.repository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Cliente não encontrado!"));

        
    }
}
