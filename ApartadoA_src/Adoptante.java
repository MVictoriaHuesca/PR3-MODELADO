import java.util.List;
import java.time.LocalDate;
import java.util.*;


public class Adoptante extends Socio {
    private List<Adopcion>adopciones;
    

    public Adoptante (LocalDate fecha, Refugio refugio){
        super(fecha, refugio);      
        adopciones = new LinkedList<Adopcion>();
        System.out.println("Se ha registrado el adoptante correctamente en el sistema, con la fecha de registro: " + fecha);
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
    public void adoptar(Animal a, Voluntario v){
        assert(a != null && v != null);
         if(a.getEstado() == EstadoAnimal.DISPONIBLE) {
            v.tramitarAdopcion(this, a);
         }else{
            System.err.println("Animal no disponible");
         }       
    }
}