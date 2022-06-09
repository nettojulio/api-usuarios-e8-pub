package e8ilab2.apiusuarios.service;

import e8ilab2.apiusuarios.dao.ClienteDAO;
import e8ilab2.apiusuarios.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class ClienteService implements IClienteService {
    @Autowired
    private ClienteDAO dao;

    @Override
    public Page<Cliente> recuperarTodos(Pageable p) {
        return dao.findAll(p);
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
}
