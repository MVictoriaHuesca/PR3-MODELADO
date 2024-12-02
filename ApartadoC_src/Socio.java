import java.util.*;
import java.time.LocalDate;

public class Socio {
    private LocalDate registro;
    private Refugio refugio;
    private Adoptante adoptante;
    private Donante donante;
    private Voluntario voluntario;    
    
    public Socio(LocalDate fecha, Refugio refugio, boolean rolAdoptante, boolean rolDonante, boolean rolVoluntario){
        assert(fecha != null && refugio != null);
        this.registro = fecha;
        this.refugio = refugio;
        if(rolAdoptante){
            this.adoptante = new Adoptante(this);
        } else {
            this.adoptante = null;
        }
        if(rolDonante){
            this.donante = new Donante(this);
        } else {
            this.donante = null;
        }
        if(rolVoluntario){
            this.voluntario = new Voluntario(this);
        }else{
            this.voluntario = null;
        }
    }

//----------getters--------------

    private LocalDate getRegistro() {
        return registro;
    }
    
    public Refugio getRefugio(){
        return refugio;
    }

    public Adoptante getAdoptante() {
        assert(adoptante != null);
        return adoptante;
    }

    public Donante getDonante() {
        assert(donante != null);
        return donante;
    }

    public Voluntario getVoluntario() {
        assert(voluntario != null);
        return voluntario;
    }

    
//------------setters-------------
    private void setRegistro(LocalDate registro) {
        assert(registro != null);
        this.registro = registro;
    }

    private void setRefugio(Refugio refugio){
        assert(refugio != null);
        this.refugio = refugio;
    }

    public void setRolAdoptante(boolean rolAdoptante){
        if(!rolAdoptante){
            this.adoptante = null;
        }
        if(rolAdoptante && this.adoptante == null){
            this.adoptante = new Adoptante(this);
        }
    }

    public void setRolDonante(boolean rolDonante){
        if(!rolDonante){
            this.donante = null;
        }
        if(rolDonante && this.adoptante == null){
            this.donante = new Donante(this);
        }
    }

    public void setRolVoluntario(boolean rolVoluntario){
        if(!rolVoluntario){
            this.voluntario = null;
        }
        if(rolVoluntario && this.voluntario == null){
            this.voluntario = new Voluntario(this);
        }
    }

//--------------- Método getRoles --------------------------

public String getRoles() {
    StringBuilder roles = new StringBuilder("Los roles que tiene el socio son: ");
    boolean tieneRol = false;

    // Verificar cada rol
    if (voluntario != null) {
        roles.append("Voluntario");
        tieneRol = true;
    }
    if (donante != null) {
        if (tieneRol) roles.append(", ");  // Agregar coma si ya hay otro rol
        roles.append("Donante");
        tieneRol = true;
    }
    if (adoptante != null) {
        if (tieneRol) roles.append(", ");
        roles.append("Adoptante");
        tieneRol = true;
    }

    // Si no tiene ningún rol
    if (!tieneRol) {
        roles.append("ninguno");
    }

    return roles.toString();
}
}
