package com.proyecto.Alkemy.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonajeDTO {
    
    private Long id;
    private String imagen;
    private String nombre;
    private int edad;
    private int peso;
    private String historia;
    private List<peliculaDTO4person> peliculas;

}