package services;

import entities.adicional.Adicional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.AdicionalRepository;

@Service
public class AdicionalService {

    @Autowired
    AdicionalRepository adicionalRepository;

    public void insertarAdicional(Adicional unAdicional) {
        adicionalRepository.save(unAdicional);
    }

}
