package br.grupointegrado.lanches.controllers;

import br.grupointegrado.lanches.models.Cliente;
import br.grupointegrado.lanches.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private ClienteRepository repository;
    @GetMapping("/clientes")
    public List<Cliente> findall(){
        return this.repository.findAll();
    };
}
