package com.appenvios.envios.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Persona {
    @Id
    private Long id;
    private String pais;
    private String estado;
    private String localidad;
    private String domicilio;
    private String telefono;
    private String email;
    private String identificacion;
    private String nombre;
    private String empresa;

    public Persona(String pais, String estado, String localidad, String domicilio, String telefono, String email, String identificacion, String nombre, String empresa) {
        this.pais = pais;
        this.estado = estado;
        this.localidad = localidad;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.email = email;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.empresa = empresa;
    }

    public Persona() {

    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
