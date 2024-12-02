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
        return adoptante;
    }

    public Donante getDonante() {
        return donante;
    }

    public Voluntario getVoluntario() {
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

    private void setAdoptante(boolean rolAdoptante){
        if(!rolAdoptante){
            this.adoptante = null;
        }
        if(rolAdoptante && this.adoptante == null){
            this.adoptante = new Adoptante(this);
        }
    }

    private void setDonante(boolean rolDonante){
        if(!rolDonante){
            this.donante = null;
        }
        if(rolDonante && this.adoptante == null){
            this.donante = new Donante(this);
        }
    }

    private void setVoluntario(boolean rolVoluntario){
        if(!rolVoluntario){
            this.voluntario = null;
        }
        if(rolVoluntario && this.voluntario == null){
            this.voluntario = new Voluntario(this);
        }
    }
}
