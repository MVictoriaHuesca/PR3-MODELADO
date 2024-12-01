import java.util.*;

public class Animal {
    private Date nacimiento;
    private EstadoAnimal estado;
    private Adopcion adopcion;
    private Refugio refugioRegistrado;

    public Animal (Date nacimiento, Refugio refugio){
        assert(nacimiento != null && refugio != null);
        this.nacimiento = nacimiento;
        this.estado = null;
        this.adopcion = null;
        this.refugioRegistrado = refugio;
        System.out.println("El animal se ha creado correctamente con la fecha de nacimiento: " + this.nacimiento);
        this.refugioRegistrado.registrar(this);
    }

    //----------- getters -----------
    private Date getNacimiento(){
        return nacimiento;
    }

    public EstadoAnimal getEstado(){
        return estado;
    }

    private Refugio getRefugioRegistrado(){
        return this.refugioRegistrado;
    }

    private Adopcion getAdopcion(){
        return this.adopcion;
    }
    //----------- setters -----------
    private void setNacimiento(Date nacimiento){
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

    private void setRefugioRegistrado(Refugio refugio){
        assert(refugio != null);
        this.refugioRegistrado = refugio;
    }
}