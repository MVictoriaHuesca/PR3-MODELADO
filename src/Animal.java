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
        System.out.println("El animal se ha creado correctamente con la fecha de nacimiento: " + this.nacimiento);
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

    public Refugio getRefugioRegistrado(){
        return this.refugioRegistrado;
    }

    public void setRefugioRegistrado(Refugio refugio){
        assert(refugio != null);
        this.refugioRegistrado = refugio;
    }
}