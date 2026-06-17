package projeto.consulta.psiquiatra.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
@Table(name = "psiquiatra")
public class PsiquiatraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "psiquiatra_id")
    private Long id;

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<ConsultaEntity> consulta_id;

    @NotBlank
    private String nome;

    @NotBlank
    private String telefone;

    @Email
    @NotBlank
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ConsultaEntity> getConsulta_id() {
        return consulta_id;
    }

    public void setConsulta_id(List<ConsultaEntity> consulta_id) {
        this.consulta_id = consulta_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PsiquiatraEntity(List<ConsultaEntity> consulta_id, String nome, String telefone, String email) {
        this.consulta_id = consulta_id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public PsiquiatraEntity() {
    }
}
