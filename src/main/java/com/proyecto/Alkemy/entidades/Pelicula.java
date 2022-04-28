package com.proyecto.Alkemy.entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.proyecto.Alkemy.entidades.Personaje;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pelicula")
@Getter
@Setter
public class Pelicula {
    
    @Id
    @Column(name = "id_pelicula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPelicula;

    private String imagen;
    private String titulo;
    
    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    private int calificacion;
    
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "genero_id", insertable = false, updatable = false)
    private Genero generoPeli;
    
    @Column(name = "genero_id", nullable = false)
    private Long generoId;
    
    @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(
            name = "pelicula_personaje",
            joinColumns = @JoinColumn(name = "pelicula_id"),
            inverseJoinColumns = @JoinColumn(name = "personaje_id"))
    private List<Personaje> personajes = new ArrayList<>();
    //private Set<Personaje> personajes = new HashSet<>(); //Si esta comentado es pq me largaba error en PersonajeMapper

    //Constructores
    public Pelicula() {
    }

    public Pelicula(Long idPelicula, String imagen, String titulo, Date fechaCreacion, int calificacion) {
        this.idPelicula = idPelicula;
        this.imagen = imagen;
        this.titulo = titulo;
        this.fechaCreacion = fechaCreacion;
        this.calificacion = calificacion;
    }

}
