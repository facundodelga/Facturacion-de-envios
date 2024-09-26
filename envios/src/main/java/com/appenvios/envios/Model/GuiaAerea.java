package com.appenvios.envios.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class GuiaAerea {

    @Id
    private Long id;

    private String trackingNumber;

    @ManyToOne
    @JoinColumn(name = "origen_id", nullable = false)
    private Persona origen;
    @ManyToOne
    @JoinColumn(name = "origen_id", nullable = false)
    private Persona destino;

    @ManyToOne
    @JoinColumn(name = "servicio_id", nullable = false)
    private Servicio servicio;


    public GuiaAerea() {
    }

    public GuiaAerea(String trackingNumber, Persona origen, Persona destino, Servicio servicio) {
        this.trackingNumber = trackingNumber;
        this.origen = origen;
        this.destino = destino;
        this.servicio = servicio;
    }


    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public Persona getOrigen() {
        return origen;
    }

    public void setOrigen(Persona origen) {
        this.origen = origen;
    }

    public Persona getDestino() {
        return destino;
    }

    public void setDestino(Persona destino) {
        this.destino = destino;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }


}
