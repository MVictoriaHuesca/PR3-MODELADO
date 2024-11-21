import java.util.List;
import java.util.Date;
import java.util.*;


public class Adoptante extends Socio {
    private List<Adopcion>adopciones;
    

    public Adoptante (Animal a,Date fechaadop,Date registro,Voluntario v ){
        super(registro);
        adopciones=new LinkedList<Adopcion>();
        Adopcion adop = new Adopcion(fechaadop,a,);
        
    }

//----------getters/setters--------------





//---------funciones-----------------------
    public void adoptar(Animal a, Voluntario v,Date fechaAdop){
        Adopcion adop=new Adopcion(fechaAdop, a , v);
        adopciones.add(adop);
    }

}