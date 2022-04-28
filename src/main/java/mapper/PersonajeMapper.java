package mapper;

import com.proyecto.Alkemy.dto.PeliculaDTO;
import com.proyecto.Alkemy.dto.PersonajeBasicDTO;
import com.proyecto.Alkemy.dto.PersonajeDTO;
import com.proyecto.Alkemy.entidades.Personaje;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;


public class PersonajeMapper {
    
    @Autowired
    private PeliculaMapper pelimapper;
    
    public Personaje personajeDTO2Entidad(PersonajeDTO dto){
        Personaje personajeEntidad = new Personaje();
        
        personajeEntidad.setImagen(dto.getImagen());
        personajeEntidad.setNombre(dto.getNombre());
        personajeEntidad.setEdad(dto.getEdad());
        personajeEntidad.setPeso(dto.getPeso());
        personajeEntidad.setHistoria(dto.getHistoria());
        
        return personajeEntidad;
    }
    
    public PersonajeDTO personajeEntidad2DTO(Personaje entidadP, boolean loadPeliculas){
        PersonajeDTO Pdto = new PersonajeDTO();
        
        Pdto.setId(entidadP.getIdPersonaje());
        Pdto.setImagen(entidadP.getImagen());
        Pdto.setNombre(entidadP.getNombre());
        Pdto.setEdad(entidadP.getEdad());
        Pdto.setPeso(entidadP.getPeso());
        Pdto.setHistoria(entidadP.getHistoria());
        
        if(loadPeliculas){
            List<PeliculaDTO> peliculasDTO = this.pelimapper.entidadPeliculaList2DTOList(Pdto.getPeliculas(), false);
                                                                    //Solucione el error declarando peliculas como List<Pelicula> en vez de PeliculaDTO
        }
        
        return Pdto;
    }
    
    
    public List<PersonajeDTO> entidadPersonajeList2DTOList(List<Personaje> entidadesP, boolean x){
        List<PersonajeDTO> dtos = new ArrayList<>();
        for(Personaje entidad : entidadesP){
            dtos.add(this.personajeEntidad2DTO(entidad, x));
        }
        return dtos;
    }
    
    public List<Personaje> personajeDTOList2Entidad(List<PersonajeDTO> dtos){
        List<Personaje> entidadesPersonajes = new ArrayList<>();
        for(PersonajeDTO dto: dtos){
            entidadesPersonajes.add(this.personajeDTO2Entidad(dto));
        }
        
        return null;
    }
    
}
