import java.time.LocalDate;
import java.util.*;

public class Donante extends Socio{
    private List<Donacion> donaciones;

    public Donante(LocalDate fecha, Refugio refugio) {
        super(fecha, refugio);
        this.donaciones = new LinkedList<Donacion>();
        System.out.println("Donante creado.");
    }

//----------getters/setters--------------

    public List<Donacion> getDonaciones() {
        return donaciones;
    }

    private void setDonaciones(List<Donacion> donaciones){
        assert(donaciones != null);
        this.donaciones = donaciones;
    }

    private void agregarDonacion(Donacion donacion) {
        assert(donacion != null);
        donaciones.add(donacion);
    }

//-----------Métodos-------------
    public void donar(float c){
        assert(c > 0);
        Donacion donacion = new Donacion(c,LocalDate.now());
        agregarDonacion(donacion);
        //Falta agregar liquidez al refugio
        Refugio ref = this.getRefugio();
        ref.setLiquidez(ref.getLiquidez()+c);
        System.out.println("Donación realizada. Donacion: " + c);
        System.out.println("Nueva liquidez del refugio: " + ref.getLiquidez());
    }

}
