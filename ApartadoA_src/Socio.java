import java.time.LocalDate;
import java.util.*;

public class Socio {
    private LocalDate registro;
    private Refugio refugio;

    public Socio(LocalDate fecha, Refugio refugio){
        assert(fecha != null && refugio != null);
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
