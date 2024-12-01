import java.util.List;
import java.util.Date;
import java.util.*;


public class Adoptante extends Socio {
    private List<Adopcion>adopciones;
    

    public Adoptante (Date registro, Refugio refugio){
        super(registro, refugio);      
        adopciones = new LinkedList<Adopcion>();
        System.out.println("Se ha registrado el adoptante correctamente en el sistema, con la fecha de registro: " + registro);
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