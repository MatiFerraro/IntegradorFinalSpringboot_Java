package entities.adicional;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Aire acondicionado")
@DiscriminatorValue("Aire acondicionado")
public class AA extends Adicional {

    public AA() {
        setDescripcion("Aire acondicionado");
        setPrecioAdicional(20000f);
    }

}
