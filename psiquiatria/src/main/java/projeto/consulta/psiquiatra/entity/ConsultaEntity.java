package projeto.consulta.psiquiatra.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "consulta")
public class ConsultaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "consulta_id")
    private Long id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private PacienteEntity paciente_id;

    private String paciente_nome;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private PsiquiatraEntity psiquiatra_id;

    private String psiquiatra_nome;

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    private LocalDateTime dataHora;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PacienteEntity getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(PacienteEntity paciente_id) {
        this.paciente_id = paciente_id;
    }

    public String getPaciente_nome() {
        return paciente_nome;
    }

    public void setPaciente_nome(String paciente_nome) {
        this.paciente_nome = paciente_nome;
    }

    public PsiquiatraEntity getPsiquiatra_id() {
        return psiquiatra_id;
    }

    public void setPsiquiatra_id(PsiquiatraEntity psiquiatra_id) {
        this.psiquiatra_id = psiquiatra_id;
    }

    public String getPsiquiatra_nome() {
        return psiquiatra_nome;
    }

    public void setPsiquiatra_nome(String psiquiatra_nome) {
        this.psiquiatra_nome = psiquiatra_nome;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public ConsultaEntity(PacienteEntity paciente_id, String paciente_nome, PsiquiatraEntity psiquiatra_id, String psiquiatra_nome, LocalDateTime dataHora) {
        this.paciente_id = paciente_id;
        this.paciente_nome = paciente_nome;
        this.psiquiatra_id = psiquiatra_id;
        this.psiquiatra_nome = psiquiatra_nome;
        this.dataHora = dataHora;
    }

    public ConsultaEntity() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ConsultaEntity that = (ConsultaEntity) o;
        return Objects.equals(paciente_nome, that.paciente_nome) && Objects.equals(psiquiatra_nome, that.psiquiatra_nome) && Objects.equals(dataHora, that.dataHora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paciente_nome, psiquiatra_nome, dataHora);
    }
}
