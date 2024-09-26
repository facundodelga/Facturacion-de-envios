package com.appenvios.envios.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Destino {
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

}
