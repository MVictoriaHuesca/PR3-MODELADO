import java.time.LocalDate;

public class Donacion {
    private float cantidad;
    private LocalDate fecha;

    public Donacion(float cantidad, LocalDate fecha) {
        assert(fecha != null && cantidad > 0);
        this.cantidad = cantidad;
        this.fecha = fecha;
        System.out.println("La donación ha tenido lugar de manera correcta, con la cantidad "+ this.cantidad +  " y la fecha: "+ this.fecha);
    }

    //----------- getters ------------

    public float getCantidad() {
        return cantidad;
    }

    private LocalDate getFecha() {
        return fecha;
    }

    //----------- setters -------------
    
    private void setCantidad(float cantidad) {
        assert(cantidad > 0);
        this.cantidad = cantidad;
    }

    private void setFecha(LocalDate fecha) {
        assert(fecha != null);
        this.fecha = fecha;
    }
}

