import java.time.LocalDate;
import java.util.*;

public class Donante extends Socio{
    // Variables que representan las relaciones
    private List<Donacion> donaciones;

    // Constructor
    public Donante(LocalDate fecha, Refugio refugio) {
        super(fecha, refugio); // Llamamos al constructor de socio
        this.donaciones = new LinkedList<Donacion>();
        System.out.println("Donante creado.");
    }

//----------getters/setters--------------

    public List<Donacion> getDonaciones() { // Visibilidad pública para que se le pueda llamar desde otras clases
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
        assert(c > 0); // Nos aseguramos de que la cantidad de la donación sea positiva 
        Donacion donacion = new Donacion(c,LocalDate.now());
        agregarDonacion(donacion);
        Refugio ref = this.getRefugio();
        ref.setLiquidez(ref.getLiquidez()+c); // Agregamos la cantidad a la liquidez del refugio asociado
        System.out.println("Donación realizada. Donacion: " + c);
        System.out.println("Nueva liquidez del refugio: " + ref.getLiquidez());
    }

}
