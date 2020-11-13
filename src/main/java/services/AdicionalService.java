package services;

import DTOs.AdicionalDTO;

public interface AdicionalService {

    public void insertarAdicional(AdicionalDTO adicionalDTO);

    public void eliminarAdicional(Integer idAdicional);

    public void modificarAdicional(Integer idAdicional, AdicionalDTO adicionalDTO);

    public AdicionalDTO consultarAdicional(Integer idAdicional);

}
