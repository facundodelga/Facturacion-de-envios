package com.appenvios.envios.Model;

import lombok.Getter;

@Getter
public enum EmpresaEnvio {
    DHL("DHL"),
    FEDEX("FedEx"),
    UPS("UPS");

    // Método para obtener el nombre de la empresa
    private final String nombre;

    // Constructor del enum
    EmpresaEnvio(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
