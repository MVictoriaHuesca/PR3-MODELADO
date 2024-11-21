import java.util.List;
import java.util.Date;
import java.util.*;


public class Adoptante extends Socio {
    private List<Adopcion>adopciones;
    

    public Adoptante (Date registro, Refugio refugio){
        super(registro, refugio);
        adopciones=new LinkedList<Adopcion>();
        /*
        Adopcion adop = new Adopcion(fechaadop,a,this,v);
        adopciones.add(adop);
        */
    }

//----------getters/setters--------------
  

    public List<Adopcion> getAdopciones(){
        return adopciones;
    }

    public void setAdopciones(List<Adopcion> adop){
        this.adopciones=adop;
    }

//---------funciones-----------------------
    public void adoptar(Animal a, Voluntario v){
         if (a.getEstado() == EstadoAnimal.DISPONIBLE) {
            Adopcion adop=new Adopcion( a ,this, v);
            v.tramitarAdopcion(this, a);
            adopciones.add(adop);
            a.setAdopcion(adop);
         }else{
            System.err.println("Animal no disponible");
         }       
    }

}