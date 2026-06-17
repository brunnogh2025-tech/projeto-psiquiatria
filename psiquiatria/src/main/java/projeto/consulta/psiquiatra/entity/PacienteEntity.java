package projeto.consulta.psiquiatra.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "paciente")
public class PacienteEntity {

    @Id
    @Column(name = "paciente_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String telefone;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private byte idade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public PacienteEntity(String telefone, String email, byte idade) {
        this.telefone = telefone;
        this.email = email;
        this.idade = idade;
    }

    public PacienteEntity() {
    }
}
