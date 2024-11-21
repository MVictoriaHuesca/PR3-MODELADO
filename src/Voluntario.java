import java.util.*;

public class Voluntario extends Socio {
    
    public Voluntario(Date registro, Refugio refugio) {
        super(registro, refugio);
    }

    public void tramitarAdopcion(Adoptante ad, Animal a) {
        if (a.getEstado() == EstadoAnimal.DISPONIBLE) {
            a.setEstado(EstadoAnimal.ADOPTADO);
            this.getRefugio().getAnimalesRefugiados().remove(a); // Probar si así funciona el borrar animal de la lista de refugiados
            
            System.out.println("Adopción registrada: Se ha adoptado al animal.");
        } else {
            System.out.println("El animal no está disponible para adopción.");
        }
    }

    public void registrar(Animal a) {
        this.getRefugio().registrar(a);
    }
}