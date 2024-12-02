import java.util.*;
import java.time.LocalDate;

public class Socio {
    // Atributo de la clase
    private LocalDate registro;

    // Variables que representan las relaciones
    private Refugio refugio;
    private Adoptante adoptante;
    private Donante donante;
    private Voluntario voluntario;    
    
    // Constructor
    public Socio(LocalDate fecha, Refugio refugio, boolean rolAdoptante, boolean rolDonante, boolean rolVoluntario) {
        assert(fecha != null && refugio != null); // Nos aseguramos de que ni la fecha ni el refugio sean nulos
        this.registro = fecha;
        this.refugio = refugio;
        // Inicializamos las variables cuyos parámetros rol estén a true
        if(rolAdoptante) {
            this.adoptante = new Adoptante(this);
        } else {
            this.adoptante = null;
        }
        if(rolDonante) {
            this.donante = new Donante(this);
        } else {
            this.donante = null;
        }
        if(rolVoluntario) {
            this.voluntario = new Voluntario(this);
        }else {
            this.voluntario = null;
        }
    }

    //--------- getters --------------

    private LocalDate getRegistro() {
        return registro;
    }
    
    public Refugio getRefugio() { // Visibilidad pública para que se le pueda llamar desde otras clases
        return refugio;
    }

    public Adoptante getAdoptante() { // Visibilidad pública para que se le pueda llamar desde otras clases
        assert(adoptante != null);
        return adoptante;
    }

    public Donante getDonante() { // Visibilidad pública para que se le pueda llamar desde otras clases
        assert(donante != null);
        return donante;
    }

    public Voluntario getVoluntario() { // Visibilidad pública para que se le pueda llamar desde otras clases
        assert(voluntario != null);
        return voluntario;
    }

    
    //------------ setters -------------

    private void setRegistro(LocalDate registro) {
        assert(registro != null);
        this.registro = registro;
    }

    private void setRefugio(Refugio refugio) {
        assert(refugio != null);
        this.refugio = refugio;
    }

    public void setRolAdoptante(boolean rolAdoptante) { // Visibilidad pública para que se le pueda llamar desde el main
        if(!rolAdoptante){
            this.adoptante = null;
        }
        if(rolAdoptante && this.adoptante == null){
            this.adoptante = new Adoptante(this);
        }
    }

    public void setRolDonante(boolean rolDonante) { // Visibilidad pública para que se le pueda llamar desde el main
        if(!rolDonante){
            this.donante = null;
        }
        if(rolDonante && this.adoptante == null){
            this.donante = new Donante(this);
        }
    }

    public void setRolVoluntario(boolean rolVoluntario) { // Visibilidad pública para que se le pueda llamar desde el main
        if(!rolVoluntario){
            this.voluntario = null;
        }
        if(rolVoluntario && this.voluntario == null){
            this.voluntario = new Voluntario(this);
        }
    }

    //--------------- Método --------------------------

    public String getRoles() { // Devuelve un string con los roles que tenga el socio
        StringBuilder roles = new StringBuilder("Los roles que tiene el socio son: ");
        boolean tieneRol = false;

        // Verificar cada rol
        if (voluntario != null) {
            roles.append("Voluntario");
            tieneRol = true;
        }
        if (donante != null) {
            if (tieneRol) roles.append(", "); // Si ya hay otro rol, se agrega una coma
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
            roles.append("Ninguno");
        }

        return roles.toString();
    }
}
