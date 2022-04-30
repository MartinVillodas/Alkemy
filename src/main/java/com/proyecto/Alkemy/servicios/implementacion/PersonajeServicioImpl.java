package com.proyecto.Alkemy.servicios.implementacion;

import com.proyecto.Alkemy.dto.PersonajeBasicDTO;
import com.proyecto.Alkemy.dto.PersonajeDTO;
import com.proyecto.Alkemy.entidades.Personaje;
import com.proyecto.Alkemy.repositorios.PersonajeRepositorio;
import com.proyecto.Alkemy.servicios.PersonajeServicio;
import java.util.List;
import com.proyecto.Alkemy.mapper.PersonajeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServicioImpl implements PersonajeServicio{
    
    @Autowired
    private PersonajeRepositorio repositorio;
    
    @Autowired
    private PersonajeMapper mapper;
    
    public List<PersonajeDTO> getAll(){
        List<Personaje> personajes = repositorio.findAll();
        List<PersonajeDTO> resultado = mapper.entidadPersonajeList2DTOList(personajes);
        return resultado;
    }

}