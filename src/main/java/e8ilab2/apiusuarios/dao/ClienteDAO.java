package e8ilab2.apiusuarios.dao;

import e8ilab2.apiusuarios.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ClienteDAO extends JpaRepository<Cliente, Integer> {
    @Query("select new e8ilab2.apiusuarios.model.Cliente(cliente.id, cliente.nome, cliente.cpf, cliente.email, cliente.telefone, cliente.dataNascimento) from Cliente as cliente order by cliente.id")
    public List<Cliente> recuperarTodos();

    @Query("select new e8ilab2.apiusuarios.model.Cliente(cliente.id, cliente.nome, cliente.cpf, cliente.email, cliente.telefone, cliente.dataNascimento) from Cliente as cliente where cliente.id = :id")
    public Cliente recuperarPorIdDoUsuario(@Param("id") Integer id);
}


