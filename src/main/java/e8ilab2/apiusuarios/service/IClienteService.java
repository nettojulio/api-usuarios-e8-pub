package e8ilab2.apiusuarios.service;

import e8ilab2.apiusuarios.model.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IClienteService {

    public Page<Cliente> recuperarTodos(Pageable p);

    public Cliente recuperarPorIdDoUsuario(Integer id);

    public Cliente novoUsuario(Cliente novoUsuario);

}
