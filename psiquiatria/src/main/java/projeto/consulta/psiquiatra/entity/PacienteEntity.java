package projeto.consulta.psiquiatra.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

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

    @OneToMany(cascade = CascadeType.PERSIST)
    private List<ConsultaEntity> consultas;
}
