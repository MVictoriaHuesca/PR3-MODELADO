import java.util.*;

public class Donacion {
    private float cantidad;
    private Date fecha;

    public Donacion(float cantidad, Date fecha) {
        assert(fecha != null && cantidad > 0);
        this.cantidad = cantidad;
        this.fecha = fecha;
        System.out.println("La donación ha tenido lugar de manera correcta, con la cantidad "+ this.cantidad +  " y la fecha: "+ this.fecha);
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
        assert(cantidad > 0);
        this.cantidad = cantidad;
    }

    public void setFecha(Date fecha) {
        assert(fecha != null);
        this.fecha = fecha;
    }

}

