package br.com.grupo.back.controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(path = "/clientes")

public class ClienteController {

    @Autowired

    @PostMapping
    public ResponseEntity<Cliente> save(@RequestBody @NotNull Cliente cliente) {
        return ResponseEntity.status(201).body(cliente.save(cliente));
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> findAll() {
        return ResponseEntity.status(200).body(save(new Cliente()).findAll());
    }

}
