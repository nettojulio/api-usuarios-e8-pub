package e8ilab2.apiusuarios.service;

import e8ilab2.apiusuarios.dao.ClienteDAO;
import e8ilab2.apiusuarios.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClienteService implements IClienteService{
    @Autowired
    private ClienteDAO dao;
    @Override
    public List<Cliente> recuperarTodos() {
        return dao.recuperarTodos() ;
    }

    @Override
    public Cliente recuperarPorIdDoUsuario(Integer id) {
        return dao.recuperarPorIdDoUsuario(id);
    }

    @Override
    public Cliente novoUsuario(Cliente novoUsuario) {

        try {

            if (novoUsuario.getNome() != null || novoUsuario.getCpf() != null || novoUsuario.getEmail() != null || novoUsuario.getTelefone() != null || novoUsuario.getDataNascimento() != null) {
                return dao.save(novoUsuario);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public Cliente alterarDadosUsuario(Cliente dadosAlterados, Integer id) {
        return null;
    }

    @Override
    public Boolean deletarUsuario(Integer id) {
        return null;
    }
}
