package services.imp;

import DTOs.AdicionalDTO;
import entities.adicional.Adicional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.AdicionalRepository;
import services.AdicionalService;

@Service
public class AdicionalServiceImp implements AdicionalService {

    @Autowired
    AdicionalRepository adicionalRepository;

    public void insertarAdicional(AdicionalDTO adicionalDTO) {
        adicionalRepository.save(converterDTO_Entity(adicionalDTO));
    }

    public void eliminarAdicional(Integer idAdicional) {
        adicionalRepository.deleteById(idAdicional);
    }

    public void modificarAdicional(Integer idAdicional, AdicionalDTO adicionalDTO) {
        Adicional adicional = converterDTO_Entity(adicionalDTO);
        adicional.setId(idAdicional);
        adicionalRepository.save(adicional);
    }

    public AdicionalDTO consultarAdicional(Integer idAdicional) {
        return converterEntity_DTO(adicionalRepository.findById(idAdicional).get());
    }

    public AdicionalDTO converterEntity_DTO(Adicional adicional) {
        AdicionalDTO adicionalDTO = null;
        adicionalDTO.setDescripcion(adicional.getDescripcion());
        adicionalDTO.setPrecioAdicional(adicional.getPrecioAdicional());
        return adicionalDTO;
    }

    public Adicional converterDTO_Entity(AdicionalDTO adicionalDTO) {
        Adicional adicional = null;
        adicional.setDescripcion(adicionalDTO.getDescripcion());
        adicional.setPrecioAdicional(adicionalDTO.getPrecioAdicional());
        return adicional;
    }

}
