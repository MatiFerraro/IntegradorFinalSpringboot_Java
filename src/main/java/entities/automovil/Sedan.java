package entities.automovil;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Sedan extends Automovil_bis {

    @Column(name = "variante")
    private String variante = "Sedan";
    @Column(name = "precioBase")
    private Float precioBase = 230000f;

    public String getVariante() {
        return variante;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public Float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Float precioBase) {
        this.precioBase = precioBase;
    }

}
