package entities.adicional;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

@Entity(name = "ABS")
@DiscriminatorValue("ABS")
public class ABS extends Adicional {

    public ABS() {
        setDescripcion("ABS");
        setPrecioAdicional(14000f);
    }

}
