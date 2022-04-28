package com.proyecto.Alkemy.entidades;

import java.util.ArrayList;
import java.util.List;
import com.proyecto.Alkemy.entidades.Pelicula;
import javax.persistence.*;

@Entity
@Table(name = "genero")
public class Genero {
    
    @Id
    @Column(name = "id_genero")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGenero;

    private String nombre;
    private String imagen;
    //private List<Pelicula> pelis = new ArrayList<>();

    public Genero() {
    }

    public Genero(Long idGenero, String nombre, String imagen) {
        this.idGenero = idGenero;
        this.nombre = nombre;
        this.imagen = imagen;
    }

    public Long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
