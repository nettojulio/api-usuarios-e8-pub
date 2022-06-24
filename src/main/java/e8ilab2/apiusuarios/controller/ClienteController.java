package e8ilab2.apiusuarios.controller;

import e8ilab2.apiusuarios.model.Cliente;
import e8ilab2.apiusuarios.service.IClienteService;
import e8ilab2.apiusuarios.utils.Messages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static e8ilab2.apiusuarios.utils.PageableUtils.showRoom;

@RestController
@CrossOrigin("*")
public class ClienteController {
    @Autowired
    private IClienteService service;

    @GetMapping("/usuarios")
    public ResponseEntity<?> recuperarTodos(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer size) {
        Page<Cliente> clientes = service.recuperarTodos(showRoom(page, size));
        return ResponseEntity.ok(clientes);
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

    @PutMapping("/usuarios/{id}")
    public ResponseEntity<?> alterarDados(@RequestBody Cliente dadosAlterados, @PathVariable Integer id) {
        if (service.recuperarPorIdDoUsuario(id) == null) {
            return ResponseEntity.status(404).body(new Messages(404, "Usuário não encontrado"));
        }

        dadosAlterados.setId(id);

        Cliente alteracoesCliente = service.alterarDadosCliente(dadosAlterados, id);
        if (alteracoesCliente != null) {
            return ResponseEntity.ok(alteracoesCliente);
        }
        return ResponseEntity.badRequest().body(new Messages(400, "Dados invalidos para atualizacao"));
    }

    @DeleteMapping("/usuarios/{id}")
    public ResponseEntity<?> deletarPedido(@PathVariable Integer id) {
        if (service.recuperarPorIdDoUsuario(id) == null) {
            return ResponseEntity.status(404).body(new Messages(404, "Usuário não encontrado"));
        }

        if (service.deletarCliente(id)) {
            return ResponseEntity.ok(new Messages(200, "Usuário deletado com sucesso"));
        }
        return ResponseEntity.badRequest().body(new Messages(400, "Erro ao deletar usuário"));
    }
}

