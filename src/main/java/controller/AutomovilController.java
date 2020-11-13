package controller;

import DTOs.AutomovilDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.imp.AutomovilServiceImp;

import java.util.List;

@RestController
@RequestMapping("/automovil")
public class AutomovilController {

    @Autowired
    public AutomovilServiceImp automovilService;

    @PostMapping("/automovil")
    public void postAutomovil(@RequestBody AutomovilDTO automovilDTO) {
        automovilService.insertarAutomovil(automovilDTO);
    }

    @DeleteMapping("/automovil/{id}")
    public void deleteAutomovil(@PathVariable Integer idAutomovil) {
        automovilService.eliminarAutomovil(idAutomovil);
    }

    @PutMapping("/automovil/{id}")
    public void putAutomovil(@PathVariable Integer idAutomovil, @RequestBody AutomovilDTO automovilDTO) {
        automovilService.modificarAutomovil(idAutomovil, automovilDTO);
    }

    @GetMapping("/automovil/{id}")
    public AutomovilDTO getAutomovil(@PathVariable Integer idAutomovil) {
        return automovilService.consultarAutomovil(idAutomovil);
    }

    @GetMapping("/automovil")
    public List<AutomovilDTO> getAutomoviles() {
        return automovilService.consultarAutomoviles();
    }

    @GetMapping("/automovil/{id}")
    public Float getPrecioAutomovil(@PathVariable Integer idAutomovil) {
        return automovilService.precioAutomovil(idAutomovil);
    }

}
