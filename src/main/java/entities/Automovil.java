package entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "automovil")
public abstract class Automovil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "precioFinal")
    protected Float precioFinal;

    @OneToOne
    @JoinColumn(name = "idCliente", referencedColumnName = "id")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "idVariante", referencedColumnName = "id")
    private Variante variante;

    @OneToMany(mappedBy = "automovil", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private List<Adicional> adicionales_auto;

    public Automovil(){
        adicionales_auto = new ArrayList<Adicional>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(Float precioFinal) {
        this.precioFinal = precioFinal;
    }

}
