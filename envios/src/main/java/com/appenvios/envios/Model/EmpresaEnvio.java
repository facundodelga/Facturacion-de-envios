package com.appenvios.envios.Model;

public enum EmpresaEnvio {
    DHL("DHL"),
    FEDEX("FedEx"),
    UPS("UPS");

    private final String nombre;

    // Constructor del enum
    EmpresaEnvio(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener el nombre de la empresa
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
