package entities.automovil;

import entities.adicional.Adicional;
import entities.Cliente;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "variante")
public abstract class Automovil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "variante")
    private String variante;
    @Column(name = "precioBase")
    private Float precioBase;

    @OneToOne
    @JoinColumn(name = "idCliente", referencedColumnName = "id")
    private Cliente cliente;

    @OneToMany(mappedBy = "automovil", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Adicional> adicionales;

    public Automovil(){
        adicionales = new ArrayList<Adicional>();
    }

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

    public List<Adicional> getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(List<Adicional> adicionales) {
        this.adicionales = adicionales;
    }

    public Float getPrecioFinal() {
        Float precioAux = 0f;
        for(Adicional adicional : adicionales) {
            precioAux += adicional.getPrecioAdicional();
        }
        precioAux += precioBase;
        return precioAux;
    }

}
