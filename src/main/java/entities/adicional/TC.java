package entities.adicional;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

@Entity(name = "Techo corredizo")
@DiscriminatorValue("Techo corredizo")
public class TC extends Adicional {

    public TC() {
        setDescripcion("Techo corredizo");
        setPrecioAdicional(12000f);
    }

}
