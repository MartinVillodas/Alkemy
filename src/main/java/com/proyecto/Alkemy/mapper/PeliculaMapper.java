package com.proyecto.Alkemy.mapper;

import com.proyecto.Alkemy.dto.PeliculaDTO;
import com.proyecto.Alkemy.dto.PersonajeDTO;
import com.proyecto.Alkemy.entidades.Pelicula;
import com.proyecto.Alkemy.entidades.Personaje;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class PeliculaMapper {
    
    @Autowired
    private PersonajeMapper personmapper;
    
    public Pelicula peliculaDTO2Entidad(PeliculaDTO dto){
        Pelicula peliculaEntidad = new Pelicula();
        
        peliculaEntidad.setImagen(dto.getImagen());
        peliculaEntidad.setTitulo(dto.getTitulo());
        peliculaEntidad.setFechaCreacion(dto.getFechaCreacion());
        peliculaEntidad.setCalificacion(dto.getCalificacion());
        peliculaEntidad.setGeneroPeli(dto.getGeneroPeli());
        //peliculaEntidad.setPersonajes(dto.getPersonajes());

        return peliculaEntidad;
    }
    
    public PeliculaDTO peliculaEntidad2DTO(Pelicula entidadPeli){
        PeliculaDTO Pdto = new PeliculaDTO();
        
        Pdto.setIdPelicula(entidadPeli.getIdPelicula());
        Pdto.setImagen(entidadPeli.getImagen());
        Pdto.setTitulo(entidadPeli.getTitulo());
        Pdto.setFechaCreacion(entidadPeli.getFechaCreacion());
        Pdto.setCalificacion(entidadPeli.getCalificacion());
        Pdto.setGeneroPeli(entidadPeli.getGeneroPeli());
        
        //Pdto.setPersonajes(entidadPeli.getPersonajes());

        return Pdto;
    }
    
    
    public List<PeliculaDTO> entidadPeliculaList2DTOList(List<Pelicula> entidadesPeli){
        List<PeliculaDTO> dtos = new ArrayList<>();
        for(Pelicula entidad : entidadesPeli){
            dtos.add(this.peliculaEntidad2DTO(entidad));
        }
        return dtos;
    }

}
