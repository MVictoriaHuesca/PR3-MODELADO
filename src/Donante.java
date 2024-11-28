import java.util.*;

public class Donante extends Socio{
    private List<Donacion> donaciones;

    public Donante(Date registro, Refugio refugio) {
        super(registro, refugio);
        this.donaciones = new LinkedList<Donacion>();
    }

//----------getters/setters--------------

    public List<Donacion> getDonaciones() {
        return donaciones;
    }

    public void setDonaciones(List<Donacion> donaciones){
        this.donaciones = donaciones;
    }

    public void agregarDonacion(Donacion donacion) {
        donaciones.add(donacion);
    }

//-----------Métodos-------------
    public void donar(float c){
        Donacion donacion = new Donacion(c,new Date());
        agregarDonacion(donacion);
        //Falta agregar liquidez al refugio
        Refugio ref = this.getRefugio();
        ref.setLiquidez(ref.getLiquidez()+c);
    }

}
