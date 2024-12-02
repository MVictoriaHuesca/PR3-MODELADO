import java.util.*;

public class Voluntario {
    // Variable que representa la relación
    private Socio socio;

    // Constructor
    public Voluntario(Socio socio) {
        this.socio = socio;
    }

    public void tramitarAdopcion(Adoptante ad, Animal a) {
        assert(ad != null && a != null); // Nos aseguramos de que ninguno de los parámetros sea nulo  
        if (a.getEstado() == EstadoAnimal.DISPONIBLE) { // Comprobamos que el animal esté disponible para ser adoptado
            Date fecha = new Date();
            Adopcion adop = new Adopcion(fecha, a , ad, this);
            ad.getAdopciones().add(adop); // Añadimos la adopción a la lista de adopciones del socio adoptante
            a.setAdopcion(adop);
            a.setEstado(EstadoAnimal.ADOPTADO);
            socio.getRefugio().getAnimalesRefugiados().remove(a); // Eliminamos el animal de la lista de refugiados del refugio
            System.out.println("Adopción registrada: Se ha adoptado al animal. Estado actual del animal: " + a.getEstado());
        } else {
            System.out.println("El animal no está disponible para adopción. Estado actual del animal: " + a.getEstado());
        }
    }

    public void registrar(Animal a) {
        socio.getRefugio().registrar(a);
    }
}