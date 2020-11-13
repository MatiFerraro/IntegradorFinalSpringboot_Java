package entities.automovil;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Sedan")
@DiscriminatorValue("Sedan")
public class Sedan extends Automovil {

    public Sedan() {
        super();
        setVariante("Sedan");
        setPrecioBase(230000f);
    }

}
