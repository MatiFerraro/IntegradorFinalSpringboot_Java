package services;

import DTOs.AutomovilDTO;

import java.util.List;

public interface AutomovilService {

    public void insertarAutomovil(AutomovilDTO automovilDTO);

    public void eliminarAutomovil(Integer idAutomovil);

    public void modificarAutomovil(Integer idAutomovil, AutomovilDTO automovilDTO);

    public List<AutomovilDTO> consultarAutomoviles();

    public AutomovilDTO consultarAutomovil(Integer idAutomovil);

    public Float precioAutomovil(Integer idAutomovil);

}
