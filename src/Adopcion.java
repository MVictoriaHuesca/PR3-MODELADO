import java.util.*;

public class Adopcion {
    private Date fecha;
    Animal animal;
    Adoptante adoptante;
    Voluntario voluntario;
    

    public Adopcion(Date fechaAdop, Animal a, Adoptante adop, Voluntario v){
        assert(fechaAdop!=null && a!=null && adop!=null && v!=null);
        this.fecha=fechaAdop;
        this.animal=a;
        this.adoptante=adop;
        this.voluntario=v;
    }

//-------------getters---------------
     public Date getFecha(){
        return fecha;
    }

    public Animal getAnimal(){
        return animal;
    }

    public Adoptante getAdoptante(){
        return adoptante;
    }

    public Voluntario getVoluntario(){
        return voluntario;
    }
///---------------setters--------------

    public void setFecha(Date fechaAdop){
        assert(fechaAdop!=null);
        this.fecha=fechaAdop;
    }

    public void setAnimal(Animal a){
        assert(a!=null);
        this.animal=a;
    }

    public void setAdoptante(Adoptante adop){
        assert(adop!=null);
        this.adoptante=adop;
    }

    public void setVoluntario(Voluntario v){
        assert(v!=null);
        this.voluntario=v;
    }

//-----------funciones----------------------
    
}