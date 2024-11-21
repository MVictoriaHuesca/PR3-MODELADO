import java.util.*;

public class Animal {
    private Date nacimiento;
    private EstadoAnimal estado;
    private Adopcion adopcion;

    public Animal (Date nacimiento){
        this.nacimiento = nacimiento;
        this.estado = null;
        this.adopcion = null;
    }

    //----------- getters -----------
    public Date getNacimiento(){
        return nacimiento;
    }

    public EstadoAnimal getEstado(){
        return estado;
    }

    public Adopcion getAdopcion(){
        return this.adopcion;
    }

    //----------- setters -----------
    public void setNacimiento(Date nacimiento){
        this.nacimiento = nacimiento;
    }

    public void setEstado(EstadoAnimal estado){
        this.estado = estado;
    }

    public void setAdopcion(Adopcion adopcion){
        this.adopcion = adopcion;
    }
}