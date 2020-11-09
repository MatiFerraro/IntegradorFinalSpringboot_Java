package services;

import entities.Automovil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.AutomovilRepository;

@Service
public class AutomovilService {

    @Autowired
    AutomovilRepository automovilRespository;

    public void insertarAutomovil(Automovil unAutomovil) {
        automovilRespository.save(unAutomovil);
    }

}
