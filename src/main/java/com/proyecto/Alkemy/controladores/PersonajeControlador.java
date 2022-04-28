package com.proyecto.Alkemy.controladores;

import com.proyecto.Alkemy.dto.PersonajeDTO;
import com.proyecto.Alkemy.entidades.Personaje;
import com.proyecto.Alkemy.servicios.PersonajeServicio;
import com.proyecto.Alkemy.servicios.implementacion.PersonajeServicioImpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
public class PersonajeControlador {

    private PersonajeServicio servicio;
    
    @Autowired
    public PersonajeControlador(PersonajeServicio personajeServicio){
        this.servicio = personajeServicio;
    }
    
    @GetMapping("/")
    public ResponseEntity<List<PersonajeDTO>> getAll(){
        List<PersonajeDTO> personajes = this.servicio.getAll();
        
        return ResponseEntity.ok(personajes);
    }
    
}
