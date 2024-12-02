import java.time.LocalDate;

public class Animal {
    private LocalDate nacimiento;
    private EstadoAnimal estado;
    private Adopcion adopcion;
    private Refugio refugioRegistrado;

    public Animal (LocalDate fecha, Refugio refugio){
        assert(fecha != null && refugio != null);
        this.nacimiento = fecha;
        this.estado = null;
        this.adopcion = null;
        this.refugioRegistrado = refugio;
        System.out.println("El animal se ha creado correctamente con la fecha de nacimiento: " + this.nacimiento + " y se ha registrado en el refugio.");
        this.refugioRegistrado.registrar(this);
    }

    //----------- getters -----------
    private LocalDate getNacimiento(){
        return nacimiento;
    }

    public EstadoAnimal getEstado(){
        return estado;
    }

    private Adopcion getAdopcion(){
        return this.adopcion;
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

    private Refugio getRefugioRegistrado(){
        return this.refugioRegistrado;
    }

    private void setRefugioRegistrado(Refugio refugio){
        assert(refugio != null);
        this.refugioRegistrado = refugio;
    }
}