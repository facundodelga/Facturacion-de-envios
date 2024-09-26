package com.appenvios.envios.Model;
public enum TipoServicio {
    ESTANDAR("Estándar"),
    EXPRES("Exprés"),
    ECONOMICO("Económico"),
    PRIORITARIO("Prioritario");

    private final String descripcion;

    // Constructor del enum
    TipoServicio(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método para obtener la descripción del servicio
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return this.descripcion;
    }
}

