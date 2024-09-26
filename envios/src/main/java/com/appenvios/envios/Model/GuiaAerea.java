package com.appenvios.envios.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Entity
@Getter @Setter
public class GuiaAerea {

    @Id
    private Long id;

    private String trackingNumber;
    @ManyToOne
    @JoinColumn(name = "origen_id", nullable = false)
    private Origen origen;
    @ManyToOne
    @JoinColumn(name = "destino_id", nullable = false)
    private Destino destino;
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;
    @ManyToOne
    @JoinColumn(name = "servicio_id", nullable = false)
    private Servicio servicio;


    public GuiaAerea() {
    }




}
