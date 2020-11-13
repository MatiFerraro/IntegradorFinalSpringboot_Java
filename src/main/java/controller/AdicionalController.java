package controller;

import DTOs.AdicionalDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.imp.AdicionalServiceImp;

@RestController
@RequestMapping("/adicional")
public class AdicionalController {

    @Autowired
    AdicionalServiceImp adicionalService;

    @PostMapping("/adicional")
    public void postAdicional(@RequestBody AdicionalDTO adicionalDTO) {
        adicionalService.insertarAdicional(adicionalDTO);
    }

    @DeleteMapping("/adicional/{id}")
    public void deleteAdicional(@PathVariable Integer idAdicional) {
        adicionalService.eliminarAdicional(idAdicional);
    }

    @PutMapping("/adicional/{id}")
    public void putAdicional(@PathVariable Integer idAdicional, @RequestBody AdicionalDTO adicionalDTO) {
        adicionalService.modificarAdicional(idAdicional, adicionalDTO);
    }

    @GetMapping("/adicional/{id}")
    public AdicionalDTO getAdicional(@PathVariable Integer idAdicional) {
        return adicionalService.consultarAdicional(idAdicional);
    }

}