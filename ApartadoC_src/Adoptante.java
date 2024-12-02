import java.util.List;
import java.time.LocalDate;
import java.util.*;


public class Adoptante {
    private List<Adopcion>adopciones;
    private Socio socio;
    

    public Adoptante (Socio socio){   
        adopciones = new LinkedList<Adopcion>();
        this.socio = socio;
    }

    //----------getters/setters--------------

    public List<Adopcion> getAdopciones(){
        return adopciones;
    }

    public void setAdopciones(List<Adopcion> adop){
        assert(adop != null);
        this.adopciones = adop;
    }

    //---------funciones-----------------------
    public void adoptar(Animal a, Voluntario voluntario){
        assert(a != null && voluntario != null);
         if(a.getEstado() == EstadoAnimal.DISPONIBLE) {
            voluntario.tramitarAdopcion(this, a);
         }else{
            System.err.println("Animal no disponible");
         }       
    }
}