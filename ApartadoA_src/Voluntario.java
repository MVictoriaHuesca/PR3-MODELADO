import java.time.LocalDate;
import java.util.*;

public class Voluntario extends Socio {
    // Constructor
    public Voluntario(LocalDate fecha, Refugio refugio) {
        super(fecha, refugio); // Llamamos al constructor de socio
    }

    public void tramitarAdopcion(Adoptante ad, Animal a) {
        assert(ad != null && a != null); // Nos aseguramos de que ninguno de los parámetros sea nulo  
        if (a.getEstado() == EstadoAnimal.DISPONIBLE) { // Comprobamos que el animal esté disponible para ser adoptado
            Date fecha = new Date();
            Adopcion adop = new Adopcion(fecha, a , ad, this);
            ad.getAdopciones().add(adop); // Añadimos la adopción a la lista de adopciones del socio adoptante
            a.setAdopcion(adop);
            a.setEstado(EstadoAnimal.ADOPTADO);
            this.getRefugio().getAnimalesRefugiados().remove(a); // Eliminamos el animal de la lista de refugiados del refugio
            System.out.println("Adopción registrada: Se ha adoptado al animal. Estado actual del animal: " + a.getEstado());
        } else {
            System.out.println("El animal no está disponible para adopción. Estado actual del animal: " + a.getEstado());
        }
    }

    public void registrar(Animal a) {
        this.getRefugio().registrar(a);
    }
}