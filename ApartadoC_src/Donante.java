import java.util.*;
import java.time.LocalDate;

public class Donante {
    private List<Donacion> donaciones;
    private Socio socio;

    public Donante(Socio socio) {
        this.donaciones = new LinkedList<Donacion>();
        this.socio = socio;
        System.err.println("Donante creado.");
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
        Refugio ref = socio.getRefugio();
        ref.setLiquidez(ref.getLiquidez()+c);
        System.out.println("Donación realizada. Donacion: " + c);
        System.out.println("Nueva liquidez del refugio: " + ref.getLiquidez());
    }

}
