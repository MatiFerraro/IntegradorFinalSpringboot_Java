package entities;


import entities.adicional.Adicional;
import entities.automovil.Automovil;

import javax.persistence.*;

@Entity
@Table(name = "adicionales_auto")
public class AdicionalesAuto {

    @ManyToOne
    @JoinColumn(name = "idAuto", referencedColumnName = "id")
    private Automovil automovil;

    @OneToOne
    @JoinColumn(name = "idAdicional", referencedColumnName = "id")
    private Adicional adicional;


    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    public Adicional getAdicional() {
        return adicional;
    }

    public void setAdicional(Adicional adicional) {
        this.adicional = adicional;
    }
}
