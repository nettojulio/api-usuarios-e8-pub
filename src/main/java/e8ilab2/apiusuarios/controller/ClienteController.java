package e8ilab2.apiusuarios.controller;

import e8ilab2.apiusuarios.model.Cliente;
import e8ilab2.apiusuarios.service.IClienteService;
import e8ilab2.apiusuarios.utils.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private IClienteService service;

    @GetMapping("/usuarios")
    public ResponseEntity<?> recuperarTodos() {
        List<Cliente> usuario = service.recuperarTodos();
    if (usuario.size() != 0 ) {
        return ResponseEntity.ok(service.recuperarTodos());

    }
       return null;
    }
    @GetMapping("/usuarios/{id}")
    public ResponseEntity<?> recuperarPorIdUsuario(@PathVariable Integer id) {
        Cliente usuario = service.recuperarPorIdDoUsuario(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        }
        return ResponseEntity.status(404).body(new Messages(404, "Usuario não encontrado"));
    }
    @PostMapping("/usuarios")
    public ResponseEntity<?> cadastrarNovoUsuario(@RequestBody Cliente novo) {
        Cliente usuario = service.novoUsuario(novo);
        if (usuario != null) {
            return ResponseEntity.status(201).body(usuario);
        }
        return ResponseEntity.badRequest().body(new Messages(400, "Dados Invalidos"));
    }
}

