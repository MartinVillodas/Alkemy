package com.proyecto.Alkemy.dto;

import com.proyecto.Alkemy.entidades.Genero;
import com.proyecto.Alkemy.entidades.Personaje;
import java.util.Date;
import java.util.List;


public class PeliculaDTO {
    
    private Long idPelicula;
    private String imagen;
    private String titulo;
    private Date fechaCreacion;
    private int calificacion;
    private Genero generoPeli;
    private List<PersonajeDTO> personajes;

    public Long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Long idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Genero getGeneroPeli() {
        return generoPeli;
    }

    public void setGeneroPeli(Genero generoPeli) {
        this.generoPeli = generoPeli;
    }

    public List<PersonajeDTO> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<PersonajeDTO> personajes) {
        this.personajes = personajes;
    }
    
}
