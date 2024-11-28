import java.util.*;

public class Voluntario extends Socio {
    
    public Voluntario(Date registro, Refugio refugio) {
        super(registro, refugio);
    }

    public void tramitarAdopcion(Adoptante ad, Animal a) {
        if (a.getEstado() == EstadoAnimal.DISPONIBLE) {
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