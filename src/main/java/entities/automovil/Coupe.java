package entities.automovil;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Coupe")
@DiscriminatorValue("Coupe")
public class Coupe extends Automovil {

    public Coupe() {
        super();
        setVariante("Coupe");
        setPrecioBase(270000f);
    }

}
