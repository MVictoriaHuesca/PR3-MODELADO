import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class Donante extends Socio{
    private List<Donacion> donaciones;

    public Donante(Date registro) {
        super(registro);
        this.donaciones = new LinkedList<Donacion>();
    }

    public List<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(List<Donacion> donaciones){
        this.donaciones = donaciones;
    }

    private void agregarDonacion(Donacion donacion) {
        donaciones.add(donacion);
    }

}
