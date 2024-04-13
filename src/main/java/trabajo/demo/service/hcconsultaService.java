package trabajo.demo.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import trabajo.demo.entity.hcConsulta;
import trabajo.demo.repository.hcconsultaRepository;

@Service
public class hcconsultaService {

        @Autowired
        hcconsultaRepository hcconsultar;

        public List <hcConsulta> gethcConsulta() {
            return hcconsultar.findAll();

        }

        public List <hcConsulta> gethcConsultaByIndHabilitado() {
            return hcconsultar.findByIndHabilitado(true);

        }

        public List<hcConsulta> getHcConsultaByNotaCx(String notaCx) {

            return hcconsultar.findLikeNotaCx("%" + notaCx.toString() + "%");
        }
       
        public void saveConsulta (hcConsulta hcConsulta){

            hcconsultar.save(hcConsulta);
        }

        @Transactional
        public void updateHcConsultaByIndHabilitado(Integer idConsulta){

            hcconsultar.updateindHabilitado(idConsulta);
        }


        public Optional<hcConsulta> gethcConsulta(Integer idConsulta) {
            return hcconsultar.findById(idConsulta);

        }

        public void saveOrUpdate (hcConsulta hcconsulta){
            hcconsultar.save(hcconsulta);
        }

        public void delete (hcConsulta hcconsulta){
            hcconsulta.setIndHabilitado(false);
            hcconsultar.save(hcconsulta);
        }



}
