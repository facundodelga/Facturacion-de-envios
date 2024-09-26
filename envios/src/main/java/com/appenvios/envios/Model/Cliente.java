package com.appenvios.envios.Model;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Entity
@Getter @Setter
@Table(name = "cliente")
public class Cliente {
    @Id
    private Long id;
    private String telefono;
    private String email;
    private String identificacion;
    private String nombre;
    private String empresa;

    @OneToMany
    @Nullable
    private ArrayList<GuiaAerea> guiasAereas;


}
