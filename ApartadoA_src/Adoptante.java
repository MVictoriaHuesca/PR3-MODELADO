import java.util.List;
import java.time.LocalDate;
import java.util.*;


public class Adoptante extends Socio {
    // Variables que representan las relaciones
    private List<Adopcion>adopciones;
    
    // Constructor
    public Adoptante (LocalDate fecha, Refugio refugio){
        super(fecha, refugio); // Llamamos al constructor de Socio
        adopciones = new LinkedList<Adopcion>();
        System.out.println("Se ha registrado el adoptante correctamente en el sistema, con la fecha de registro: " + fecha);
    }

    //----------getters/setters--------------

    public List<Adopcion> getAdopciones(){
        return adopciones;
    }

    private void setAdopciones(List<Adopcion> adop){
        assert(adop != null);
        this.adopciones = adop;
    }

    //---------funciones-----------------------
    public void adoptar(Animal a, Voluntario v){
        assert(a != null && v != null); // Nos aseguramos de que ninguno de los parámetros sea nulo
         if(a.getEstado() == EstadoAnimal.DISPONIBLE) {
            v.tramitarAdopcion(this, a);
         }else{
            System.err.println("El animal no está disponible para adopción.");
         }       
    }
}