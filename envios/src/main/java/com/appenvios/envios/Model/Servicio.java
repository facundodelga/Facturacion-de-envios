package com.appenvios.envios.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Servicio {
    @Id
    private Long id;

    private EmpresaEnvio empresa;
    private TipoServicio tipoServicio;
    private Double precio;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
