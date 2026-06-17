package projeto.consulta.psiquiatra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.consulta.psiquiatra.entity.PacienteEntity;

public interface PacienteDao extends JpaRepository<Long,PacienteEntity> {
}
