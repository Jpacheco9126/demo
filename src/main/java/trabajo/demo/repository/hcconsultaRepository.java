package trabajo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import trabajo.demo.entity.hcConsulta;

@Repository
public interface hcconsultaRepository extends JpaRepository <hcConsulta, Integer > {

}
