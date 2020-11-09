package entities;

import javax.persistence.*;

@Entity
@Table(name = "adicional")
public class Adicional {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "precio")
    private Float precioAdicional;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecioAdicional() {
        return precioAdicional;
    }

    public void setPrecioAdicional(Float precioAdicional) {
        this.precioAdicional = precioAdicional;
    }
}
