package services.imp;

import DTOs.AdicionalDTO;
import DTOs.AutomovilDTO;
import entities.AdicionalesAuto;
import entities.adicional.Adicional;
import entities.automovil.Automovil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.AdicionalesAutoRepository;
import repositories.AutomovilRepository;
import services.AutomovilService;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutomovilServiceImp implements AutomovilService {

    @Autowired
    AutomovilRepository automovilRespository;
    @Autowired
    AdicionalesAutoRepository adicionalesAutoRepository;

    public void insertarAutomovil(AutomovilDTO automovilDTO) {
        AdicionalesAuto adicionalesAuto = null;
        Automovil automovil = converterDTO_Entity(automovilDTO);
        automovilRespository.save(automovil);
        List<Adicional> adicionales = automovil.getAdicionales();
        for(Adicional adicional : adicionales) {
            adicionalesAuto.setAutomovil(automovil);
            adicionalesAuto.setAdicional(adicional);
            adicionalesAutoRepository.save(adicionalesAuto);
        }
    }

    public void eliminarAutomovil(Integer idAutomovil) {
        automovilRespository.deleteById(idAutomovil);
    }

    public void modificarAutomovil(Integer idAutomovil, AutomovilDTO automovilDTO) {
        AdicionalesAuto adicionalesAuto = null;
        Automovil automovil = converterDTO_Entity(automovilDTO);
        automovil.setId(idAutomovil);
        automovilRespository.save(automovil);
        List<Adicional> adicionales = automovil.getAdicionales();
        for(Adicional adicional : adicionales) {
            adicionalesAuto.setAutomovil(automovil);
            adicionalesAuto.setAdicional(adicional);
            adicionalesAutoRepository.save(adicionalesAuto);
        }
    }

    public List<AutomovilDTO> consultarAutomoviles() {
        List<AutomovilDTO> automovilesDTO = new ArrayList<>();
        automovilRespository.findAll().forEach(unAutomovil -> automovilesDTO.add(converterEntity_DTO(unAutomovil)));
        return automovilesDTO;
    }

    public AutomovilDTO consultarAutomovil(Integer idAutomovil) {
        return converterEntity_DTO(automovilRespository.findById(idAutomovil).get());
    }

    public Float precioAutomovil(Integer idAutomovil) {
        Automovil automovil = automovilRespository.findById(idAutomovil).get();
        return automovil.getPrecioFinal();
    }

    public AutomovilDTO converterEntity_DTO(Automovil automovil) {
        AutomovilDTO automovilDTO = null;
        AdicionalServiceImp adicionalService = null;
        List<Adicional> adicionales = automovil.getAdicionales();
        List<AdicionalDTO> adicionalesDTO = null;

        automovilDTO.setVariante(automovil.getVariante());
        automovilDTO.setPrecioBase(automovil.getPrecioBase());
        for(Adicional adicional : adicionales){
            adicionalesDTO.add(adicionalService.converterEntity_DTO(adicional));
        }
        automovilDTO.setAdicionales(adicionalesDTO);

        return automovilDTO;
    }

    public Automovil converterDTO_Entity(AutomovilDTO automovilDTO) {
        Automovil automovil = null;
        AdicionalServiceImp adicionalService = null;
        List<Adicional> adicionales = null;
        List<AdicionalDTO> adicionalesDTO = automovilDTO.getAdicionales();

        automovil.setVariante(automovilDTO.getVariante());
        automovil.setPrecioBase(automovilDTO.getPrecioBase());
        for(AdicionalDTO adicionalDTO : adicionalesDTO){
            adicionales.add(adicionalService.converterDTO_Entity(adicionalDTO));
        }
        automovil.setAdicionales(adicionales);

        return automovil;
    }

}
