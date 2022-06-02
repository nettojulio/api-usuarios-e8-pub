package e8ilab2.apiusuarios.service;

import e8ilab2.apiusuarios.model.Cliente;

import java.util.List;

public interface IClienteService {

    public List<Cliente> recuperarTodos();

    public Cliente recuperarPorIdDoUsuario(Integer id);

    public Cliente novoUsuario(Cliente novoUsuario);

    public Cliente alterarDadosUsuario(Cliente dadosAlterados, Integer id);

    public Boolean deletarUsuario(Integer id);
}
