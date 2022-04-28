package com.proyecto.Alkemy.servicios.implementacion;

import com.proyecto.Alkemy.dto.GeneroDTO;
import com.proyecto.Alkemy.entidades.Genero;
import com.proyecto.Alkemy.repositorios.GeneroRepositorio;
import com.proyecto.Alkemy.servicios.GeneroServicio;
import java.util.List;
import mapper.GeneroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroServicioImpl implements GeneroServicio {
    
    //@Autowired
    //private GeneroMapper generoMapper;
    
    GeneroMapper generoMapper = new GeneroMapper();
    
    @Autowired
    private GeneroRepositorio repositorio;
    
    public GeneroDTO save(GeneroDTO dto){
        Genero entidadG = generoMapper.generoDTO2Entidad(dto);
        Genero entidadSaved = repositorio.save(entidadG);
        GeneroDTO resultado = generoMapper.generoEntidad2DTO(entidadSaved);

        return resultado;
    }

    //public List<GeneroDTO> getAllGeneros() {
    //    
    //}
    
}
