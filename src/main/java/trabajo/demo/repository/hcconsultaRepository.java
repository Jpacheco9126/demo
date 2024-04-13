package trabajo.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import trabajo.demo.entity.hcConsulta;

@Repository
public interface hcconsultaRepository extends JpaRepository <hcConsulta, Integer > {


    //public List <hcConsulta> findByIndHabilitado(Boolean indHabilitado); 
    @Query(value = "SELECT * FROM hcconsulta WHERE indHabilitado = :indHabilitado", nativeQuery = true)
    public List<hcConsulta> findByIndHabilitado(@Param("indHabilitado") Boolean indHabilitado);

    @Query(value = "SELECT * FROM hcconsulta WHERE notaCx LIKE :notaCx", nativeQuery = true)
    public List<hcConsulta> findLikeNotaCx(@Param("notaCx") String notaCx);

    @Modifying
    @Query(value =  "UPDATE hcconsulta SET indHabilitado = 0 WHERE idConsulta = :idConsulta", nativeQuery = true)
    public void  updateindHabilitado (@Param("idConsulta") Integer idConsulta);

}
