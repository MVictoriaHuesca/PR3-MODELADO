import java.time.LocalDate;
import java.util.*;

public class Socio {
    // Atributo de la clase
    private LocalDate registro;

    // Variables que representan las relaciones
    private Refugio refugio;

    // Contructor
    public Socio(LocalDate fecha, Refugio refugio){
        assert(fecha != null && refugio != null); // Nos aseguramos de que ni la fecha ni el refugio sean nulos
        this.registro = fecha;
        this.refugio = refugio;
    }

//----------getters/setters--------------

    private LocalDate getRegistro() {
        return registro;
    }

    private void setRegistro(LocalDate registro) {
        assert(registro != null);
        this.registro = registro;
    }  

    protected Refugio getRefugio(){
        return refugio;
    }

    private void setRefugio(Refugio refugio){
        assert(refugio != null);
        this.refugio = refugio;
    }
}
