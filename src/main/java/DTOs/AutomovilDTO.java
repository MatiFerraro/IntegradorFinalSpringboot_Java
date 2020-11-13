package DTOs;

import java.util.List;

public class AutomovilDTO {

    private Float precioBase;
    private String variante;
    private List<AdicionalDTO> adicionalesDTO;

    public Float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Float precioBase) {
        this.precioBase = precioBase;
    }

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public List<AdicionalDTO> getAdicionales() {
        return adicionalesDTO;
    }

    public void setAdicionales(List<AdicionalDTO> adicionalesDTO) {
        this.adicionalesDTO = adicionalesDTO;
    }
}
