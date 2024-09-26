package com.appenvios.envios.Model;

import lombok.Getter;

@Getter
public enum TipoServicio {
    ESTANDAR("Estándar"),
    EXPRES("Exprés"),
    ECONOMICO("Económico"),
    PRIORITARIO("Prioritario");

    // Método para obtener la descripción del servicio
    private final String descripcion;

    // Constructor del enum
    TipoServicio(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return this.descripcion;
    }
}

