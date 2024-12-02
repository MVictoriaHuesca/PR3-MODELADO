import java.util.List;
import java.time.LocalDate;
import java.util.*;


public class Adoptante {
    // Variables que representan las relaciones
    private List<Adopcion>adopciones;
    private Socio socio;
    
    // Constructor
    public Adoptante (Socio socio){   
        adopciones = new LinkedList<Adopcion>();
        this.socio = socio;
    }

    //----------getters/setters--------------

    public List<Adopcion> getAdopciones(){
        return adopciones;
    }

    private void setAdopciones(List<Adopcion> adop){
        assert(adop != null);
        this.adopciones = adop;
    }

    //-----------Métodos-------------
    
    public void adoptar(Animal a, Voluntario voluntario){        
        assert(a != null && voluntario != null);  // Nos aseguramos de que ninguno de los parámetros sea nulo       
         if(a.getEstado() == EstadoAnimal.DISPONIBLE) { // Comprobamos que el animal esté disponible para ser adoptado
            voluntario.tramitarAdopcion(this, a); // Llamamos a la función para que el voluntario sea el encargado de tramitar la adopción
         } else {
            System.err.println("Animal no disponible para la adopción");
         }       
    }
}