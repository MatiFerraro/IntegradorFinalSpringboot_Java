package services;

import DTOs.AdicionalDTO;
import DTOs.AutomovilDTO;
import entities.adicional.Adicional;
import entities.automovil.Automovil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.AutomovilRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutomovilService {

    @Autowired
    AutomovilRepository automovilRespository;

    public void insertarAutomovil(AutomovilDTO automovilDTO) {
        automovilRespository.save(converterDTO_Entity(automovilDTO));
    }

    public void eliminarAutomovil(Integer idAutomovil) {
        automovilRespository.deleteById(idAutomovil);
    }

    public void modificarAutomovil(Integer idAutomovil, AutomovilDTO automovilDTO) {
        Automovil automovil = converterDTO_Entity(automovilDTO);
        automovil.setId(idAutomovil);
        automovilRespository.save(automovil);
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
        Automovil miAutomovil = automovilRespository.findById(idAutomovil).get();
        return miAutomovil.getPrecioFinal();
    }

    public AutomovilDTO converterEntity_DTO(Automovil automovil) {
        AutomovilDTO automovilDTO = null;
        AdicionalService adicionalService = null;
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
        AdicionalService adicionalService = null;
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
