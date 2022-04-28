package com.proyecto.Alkemy.repositorios;

import com.proyecto.Alkemy.entidades.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepositorio extends JpaRepository<Genero, Long>{
    
}
