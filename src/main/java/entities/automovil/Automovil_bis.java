package entities.automovil;

import entities.Cliente;
import entities.adicional.Adicional;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Automovil_bis {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Integer id;
        @Column(name = "precioFinal")
        private Float precioFinal;

        @OneToOne
        @JoinColumn(name = "idCliente", referencedColumnName = "id")
        private Cliente cliente;

        @OneToMany(mappedBy = "automovil", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
        private List<Adicional> adicionales_auto;

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
