package entities.adicional;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Airbag")
@DiscriminatorValue("Airbag")
public class AB extends Adicional {

    public AB() {
        setDescripcion("Airbag");
        setPrecioAdicional(7000f);
    }

}
