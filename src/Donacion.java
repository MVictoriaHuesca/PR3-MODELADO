import java.util.*;

public class Donacion {
    private float cantidad;
    private Date fecha;

    public Donacion(float cantidad, Date fecha) {
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    //----------- getters ------------

    public float getCantidad() {
        return cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    //----------- setters -------------
    
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}

