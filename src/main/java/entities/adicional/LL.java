package entities.adicional;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Llantas")
@DiscriminatorValue("Llantas")
public class LL extends Adicional {

    public LL() {
        setDescripcion("Llantas");
        setPrecioAdicional(12000f);
    }

}
