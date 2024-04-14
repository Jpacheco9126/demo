package trabajo.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trabajo.demo.entity.hcConsulta;
import trabajo.demo.service.hcconsultaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping(path = "hcConsulta")
public class hcConsultaController {

    @Autowired
    private  hcconsultaService hcConsultaS;
    
    @GetMapping
    public List<hcConsulta> getAll(){
        return hcConsultaS.gethcConsulta();
    }

    @GetMapping("habilitados")
    public List<hcConsulta> getByIndHabilitado() {
        return hcConsultaS.gethcConsultaByIndHabilitado();
    }

    @PostMapping("nota")
    public List<hcConsulta> getConsultaByNota(@RequestBody Map<String, String> body){

        String notaCx = body.get("notaCx");
        return hcConsultaS.getHcConsultaByNotaCx(notaCx);
    }

    @PostMapping()
    public String saveConsulta(@RequestBody hcConsulta consulta) {
        
        hcConsultaS.saveConsulta(consulta);
        return "Guardado con Éxito";
    }

    @PostMapping("deshabilitar")
    public void updateConsultaByIndHabilitado(@RequestBody Map<String, Integer> body){

        Integer idConsulta = body.get("idConsulta");
        hcConsultaS.updateHcConsultaByIndHabilitado(idConsulta);
    }

}

    




