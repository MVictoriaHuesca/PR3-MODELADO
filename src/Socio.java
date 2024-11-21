import java.util.*;

public class Socio {
    private Date registro;
    private Refugio refugio;

    public Socio(Date registro, Refugio refugio){
        this.registro = registro;
        this.refugio = refugio;
    }

//----------getters/setters--------------

    public Date getRegistro() {
        return registro;
    }

    public Refugio getRefugio() {
        return refugio;
    }

    public void setRefugio(Refugio refugio) {
        this.refugio = refugio;
    }

    public void setRegistro(Date registro) {
        this.registro = registro;
    } 
    

}
