import java.util.*;

public class Animal {
    private Date nacimiento;
    private EstadoAnimal estado;
    private Adopcion adopcion;
    private Refugio refugioRegistrado;

    public Animal (Date nacimiento){
        assert(nacimiento != null);
        this.nacimiento = nacimiento;
        this.estado = null;
        this.adopcion = null;
        this.refugioRegistrado = null;
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
        assert(nacimiento != null);
        this.nacimiento = nacimiento;
    }

    public void setEstado(EstadoAnimal estado){
        assert(estado != null);
        this.estado = estado;
    }

    public void setAdopcion(Adopcion adopcion){
        assert(adopcion != null);
        this.adopcion = adopcion;
    }

    public void getRefugioRegistrado(){
        assert(refugio != null);
        this.refugioRegistrado = refugio;
    }
}