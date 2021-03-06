package com.proyecto.Alkemy.dto;

import com.proyecto.Alkemy.entidades.Genero;
import java.util.Date;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PeliculaDTO {
    
    private Long idPelicula;
    private String imagen;
    private String titulo;
    private Date fechaCreacion;
    private int calificacion;
    private Genero generoPeli;
    private List<personajeDTO4peli> personajes;
    
}
