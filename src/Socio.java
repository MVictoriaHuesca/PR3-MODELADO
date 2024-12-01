import java.util.*;

public class Socio {
    private Date registro;
    private Refugio refugio;

    public Socio(Date registro, Refugio refugio){
        assert(registro != null && refugio != null);
        this.registro = registro;
        this.refugio = refugio;
    }

//----------getters/setters--------------

    private Date getRegistro() {
        return registro;
    }

    private void setRegistro(Date registro) {
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
