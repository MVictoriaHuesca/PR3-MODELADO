import java.util.*;

public class Adopcion {
    private Date fecha;
    Animal animal;
    Adoptante adoptante;

    public Adopcion(Date fechaAdop, Animal a, Adoptante adop){
        this.fecha=fechaAdop;
        this.animal=a;
        this.adoptante=adop;
    }

//----------getters/setters--------------
     public Date getFecha(){
        return fecha;
    }

    public Animal getAnimal(){
        return animal;
    }

    public Adoptante getAdoptante(){
        return adoptante;
    }

    public void setFecha(Date fechaAdop){
        this.fecha=fechaAdop;
    }

    public void setAnimal(Animal a){
        this.animal=a;
    }

    public void setAdoptante(Adoptante adop){
        this.adoptante=adop;
    }

//-----------funciones----------------------
    
}