package com.appenvios.envios.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Persona {
    @Id
    private Long id;
    private String pais;
    private String estado;
    private String localidad;
    private String domicilio;

    @ManyToOne
    private Cliente cliente;

    public Persona(String pais, String estado, String localidad, String domicilio, Cliente cliente) {
        this.pais = pais;
        this.estado = estado;
        this.localidad = localidad;
        this.domicilio = domicilio;
        this.cliente = cliente;
    }

    public Persona() {

    }

}
