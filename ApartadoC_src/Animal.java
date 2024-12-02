import java.util.*;
import java.time.LocalDate;

public class Animal {
    // Atributos de la clase 
    private LocalDate nacimiento;
    private EstadoAnimal estado;

    // Variables que representan las relaciones
    private Adopcion adopcion;
    private Refugio refugioRegistrado;

    // Constructor
    public Animal (LocalDate nacimiento, Refugio refugio){
        assert(nacimiento != null && refugio != null); // Nos aseguramos de que ninguno de los parámetros sea nulo   
        this.nacimiento = nacimiento;
        this.estado = null;
        this.adopcion = null;
        this.refugioRegistrado = refugio;
        System.out.println("El animal se ha creado correctamente con la fecha de nacimiento: " + this.nacimiento + " y se ha registrado en el refugio.");
        this.refugioRegistrado.registrar(this); // Registramos al animal en el refugio
    }

    //----------- getters -----------

    private LocalDate getNacimiento(){
        return nacimiento;
    }

    public EstadoAnimal getEstado(){ // Visibilidad pública para que se le pueda llamar desde otras clases
        return estado;
    }

    private Adopcion getAdopcion(){
        return this.adopcion;
    }

    private Refugio getRefugioRegistrado(){
        return this.refugioRegistrado;
    }

    //----------- setters -----------

    private void setNacimiento(LocalDate nacimiento){
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