import java.util.*;

public class Adopcion {
    private Date fecha;
    private Animal animal;
    private Socio adoptante;
    private Socio voluntario;
    

    public Adopcion(Date fechaAdop, Animal a, Socio adop, Socio v){
        assert(fechaAdop!=null && a!=null && adop!=null && v!=null);
        this.fecha=fechaAdop;
        this.animal=a;
        this.adoptante=adop;
        this.voluntario=v;
        System.err.println("Adopcion creada.");
    }

//-------------getters---------------
    private Date getFecha(){
        return fecha;
    }

    private Animal getAnimal(){
        return animal;
    }

    private Socio getAdoptante(){
        return adoptante;
    }

    private Socio getVoluntario(){
        return voluntario;
    }
///---------------setters--------------

    private void setFecha(Date fechaAdop){
        assert(fechaAdop!=null);
        this.fecha=fechaAdop;
    }

    private void setAnimal(Animal a){
        assert(a!=null);
        this.animal=a;
    }

    private void setAdoptante(Adoptante adop){
        assert(adop!=null);
        this.adoptante=adop;
    }

    private void setVoluntario(Voluntario v){
        assert(v!=null);
        this.voluntario=v;
    }
}