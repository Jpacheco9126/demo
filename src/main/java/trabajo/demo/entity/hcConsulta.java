package trabajo.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.var;

@Data
@Entity
@Table(name = "hcconsulta")
public class hcConsulta {

    @Id
    private Integer idConsulta;
    private Integer idCliente;
    private Integer idMedico;
    private Integer idDx;
    private String NotaCx;
    private Boolean indHabilitado;

}
