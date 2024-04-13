package trabajo.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.var;

@Data
@Entity
@Table(name = "hcConsulta")
public class hcConsulta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idConsulta")
    private Integer idConsulta;

    @Column(name = "idCliente",nullable = false)
    private Integer idCliente;

    @Column(name = "idMedico",nullable = false)
    private Integer idMedico;

    @Column(name = "idDx",nullable = false)
    private Integer idDx;

    @Column (name = "notaCx", nullable =  true, length = 20)
    private String notaCx;

    @Column(name = "indHabilitado", nullable = false)
    private Boolean indHabilitado;

}
