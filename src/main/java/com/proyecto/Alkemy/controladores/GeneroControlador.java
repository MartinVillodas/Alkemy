package com.proyecto.Alkemy.controladores;

import com.proyecto.Alkemy.dto.GeneroDTO;
import com.proyecto.Alkemy.servicios.GeneroServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("generos")
public class GeneroControlador {
    
    @Autowired
    private GeneroServicio servicio;
    
    /*@GetMapping
    public ResponseEntity<List<GeneroDTO>> getAll(){
        List<GeneroDTO> generos = servicio. ;
        
        return ResponseEntity.ok()body(generos);     
    }*/
    
    @PostMapping
    public ResponseEntity<GeneroDTO> save(@RequestBody GeneroDTO generodto){
        GeneroDTO generoGuardado = servicio.save(generodto);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(generoGuardado);
    }
    
}
