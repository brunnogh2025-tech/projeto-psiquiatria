package projeto.consulta.psiquiatra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projeto.consulta.psiquiatra.entity.ConsultaEntity;

public interface ConsultaDao extends JpaRepository<ConsultaEntity, Long> {

}
