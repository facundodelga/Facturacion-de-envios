package com.appenvios.envios.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Servicio {
    @Id
    private Long id;

    private EmpresaEnvio empresa;
    private TipoServicio tipoServicio;
    private Double precio;

    public Servicio(EmpresaEnvio empresa, TipoServicio tipoServicio, Double precio) {
        this.empresa = empresa;
        this.tipoServicio = tipoServicio;
        this.precio = precio;
    }

    public Servicio() {

    }


}
