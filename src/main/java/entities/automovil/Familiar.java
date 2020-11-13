package entities.automovil;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Familiar")
@DiscriminatorValue("Familiar")
public class Familiar extends Automovil {

    public Familiar() {
        super();
        setVariante("Familiar");
        setPrecioBase(245000f);
    }

}
