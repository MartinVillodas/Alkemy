package com.proyecto.Alkemy.entidades;

import java.util.ArrayList;
import java.util.List;
import com.proyecto.Alkemy.entidades.Pelicula;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "personaje")
@Getter
@Setter
public class Personaje {
    
    @Id
    @Column(name = "id_personaje")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersonaje;

    private String imagen;
    private String nombre;
    private int edad;
    private int peso;
    private String historia;
    
    @ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)
    private List<Pelicula> peliculas = new ArrayList<>();
    
    //Constructores
    public Personaje() {
    }

    public Personaje(Long id, String imagen, String nombre, int edad, int peso, String historia) {
        this.idPersonaje = id;
        this.imagen = imagen;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
    }

}