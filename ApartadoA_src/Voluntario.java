import java.time.LocalDate;
import java.util.*;

public class Voluntario extends Socio {
    
    public Voluntario(LocalDate fecha, Refugio refugio) {
        super(fecha, refugio);
    }

    public void tramitarAdopcion(Adoptante ad, Animal a) {
        assert(ad != null && a != null);
        if (a.getEstado() == EstadoAnimal.DISPONIBLE) {
            Date fecha = new Date();
            Adopcion adop = new Adopcion(fecha, a , ad, this);
            ad.getAdopciones().add(adop);
            a.setAdopcion(adop);
            a.setEstado(EstadoAnimal.ADOPTADO);
            this.getRefugio().getAnimalesRefugiados().remove(a); // Probar si así funciona el borrar animal de la lista de refugiados
            System.out.println("Adopción registrada: Se ha adoptado al animal. Estado actual del animal: " + a.getEstado());
        } else {
            System.out.println("El animal no está disponible para adopción. Estado actual del animal: " + a.getEstado());
        }
    }

    public void registrar(Animal a) {
        this.getRefugio().registrar(a);
    }
}