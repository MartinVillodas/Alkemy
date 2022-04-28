package mapper;

import com.proyecto.Alkemy.dto.PeliculaDTO;
import com.proyecto.Alkemy.dto.PersonajeDTO;
import com.proyecto.Alkemy.entidades.Pelicula;
import com.proyecto.Alkemy.entidades.Personaje;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Set;


public class PeliculaMapper {
    
    @Autowired
    private PersonajeMapper personmapper;
    
    public Pelicula peliculaDTO2Entidad(PeliculaDTO dto){
        Pelicula peliculaEntidad = new Pelicula();
        
        peliculaEntidad.setImagen(dto.getImagen());
        peliculaEntidad.setTitulo(dto.getTitulo());
        peliculaEntidad.setFechaCreacion(dto.getFechaCreacion());
        peliculaEntidad.setCalificacion(dto.getCalificacion());
        peliculaEntidad.setGeneroPeli(dto.getGeneroPeli());
        
        //Personajes
        List<Personaje> personajes = this.personmapper.personajeDTOList2Entidad(dto.getPersonajes());
        peliculaEntidad.setPersonajes(personajes);
        
        return peliculaEntidad;
    }
    
    public PeliculaDTO peliculaEntidad2DTO(Pelicula entidadPeli, boolean loadPersonajes){
        PeliculaDTO Pdto = new PeliculaDTO();
        
        Pdto.setIdPelicula(entidadPeli.getIdPelicula());
        Pdto.setImagen(entidadPeli.getImagen());
        Pdto.setTitulo(entidadPeli.getTitulo());
        Pdto.setFechaCreacion(entidadPeli.getFechaCreacion());
        Pdto.setCalificacion(entidadPeli.getCalificacion());
        Pdto.setGeneroPeli(entidadPeli.getGeneroPeli());
        
        if(loadPersonajes){
            List<PersonajeDTO> personajesDTOS = this.personmapper.entidadPersonajeList2DTOList(entidadPeli.getPersonajes(), false);
        }
        return Pdto;
    }
    
    
    public List<PeliculaDTO> entidadPeliculaList2DTOList(List<Pelicula> entidadesPeli, boolean loadPersonajes){
        List<PeliculaDTO> dtos = new ArrayList<>();
        for(Pelicula entidad : entidadesPeli){
            dtos.add(this.peliculaEntidad2DTO(entidad, loadPersonajes));
        }
        return dtos;
    }
    
    /*
    public LocalDate string2LocalDate(String stringDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(stringDate, formatter);
        
        return date;
    }*/

}
