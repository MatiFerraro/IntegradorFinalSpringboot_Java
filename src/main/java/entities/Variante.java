package entities;

import javax.persistence.*;

@Entity
@Table(name = "variante")
public class Variante {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "variante")
    private String variante;
    @Column(name = "precioBase")
    private Float precioBase;

    @OneToOne(mappedBy = "variante")
    Automovil automovil;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
