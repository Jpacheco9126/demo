package trabajo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trabajo.demo.entity.hcConsulta;
import trabajo.demo.service.hcconsultaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(path = "hcConsulta")
public class hcConsultaController {

    @Autowired
    private  hcconsultaService hcConsultaS;
    




    @GetMapping
    public List<hcConsulta> getAll(){
        return hcConsultaS.gethcConsulta();
    }

}
