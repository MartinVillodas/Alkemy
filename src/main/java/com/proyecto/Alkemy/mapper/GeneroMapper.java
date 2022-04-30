package com.proyecto.Alkemy.mapper;

import com.proyecto.Alkemy.dto.GeneroDTO;
import com.proyecto.Alkemy.entidades.Genero;
import org.springframework.stereotype.Component;

@Component
public class GeneroMapper {
    
    public Genero generoDTO2Entidad(GeneroDTO dto){
        Genero generoEntidad = new Genero();
        
        generoEntidad.setImagen(dto.getImagen());
        generoEntidad.setNombre(dto.getNombre());
        
        return generoEntidad;
    }
    
    public GeneroDTO generoEntidad2DTO(Genero entidadG){
        GeneroDTO Gdto = new GeneroDTO();
        
        Gdto.setIdGenero(entidadG.getIdGenero());
        Gdto.setImagen(entidadG.getImagen());
        Gdto.setNombre(entidadG.getNombre());
        
        return Gdto;
    }
    
}
