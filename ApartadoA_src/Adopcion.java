import java.util.*;

public class Adopcion {
    // Atributo de la clase
    private Date fecha;

    // Variables que representan las relaciones
    private Animal animal;
    private Adoptante adoptante;
    Voluntario voluntario;
    
    // Constructor
    public Adopcion(Date fechaAdop, Animal a, Adoptante adop, Voluntario v){
        assert(fechaAdop!=null && a!=null && adop!=null && v!=null); // Nos aseguramos de que ninguno de los parámetros sea nulo   
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

    private Adoptante getAdoptante(){
        return adoptante;
    }

    private Voluntario getVoluntario(){
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