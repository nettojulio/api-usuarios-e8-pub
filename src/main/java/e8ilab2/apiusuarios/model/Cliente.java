package e8ilab2.apiusuarios.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "usuarios")
public class Cliente {

    @Id
    @Column( name = "id_usuario",nullable = false, columnDefinition = "SERIAL")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column( name = "nome",nullable = false, length  = 50, columnDefinition = "VARCHAR")
   private String nome ;


    @Column( name = "cpf",nullable = false, length = 11, columnDefinition = "VARCHAR")
    private String cpf ;


    @Column( name = "email",nullable = false, length = 100, columnDefinition = "VARCHAR")
    private String email ;

    @Column( name = "telefone",nullable = false, length = 12, columnDefinition = "VARCHAR")
    private String telefone ;

    @Column (name = "data_nascimento", nullable = false, columnDefinition = "DATE")
    private Date dataNascimento ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;

    }

    public Cliente() {
    }

    public Cliente(Integer id, String nome, String cpf, String email, String telefone, Date dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
