package com.proyecto.Alkemy.dto;

import com.proyecto.Alkemy.entidades.Genero;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class peliculaDTO4person {
    
    private Long idPelicula;
    private String imagen;
    private String titulo;
    private Date fechaCreacion;
    private int calificacion;
    private Genero generoPeli;
}
