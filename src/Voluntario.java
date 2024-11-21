import java.util.*;

public class Voluntario extends Socio {
    
    public Voluntario(Date registro) {
        super(registro);
    }

    public void tramitarAdopcion(Adoptante ad, Animal a) {
        if (a.getEstado() == EstadoAnimal.DISPONIBLE) {
            a.setEstado(EstadoAnimal.ADOPTADO);
            animalesRefugiados.remove(a);
            System.out.println("Adopción registrada: " + ad + " adoptó al animal.");
        } else {
            System.out.println("El animal no está disponible para adopción.");
        }
    }

    public void registrar(Animal a) {
        registrarAnimal(a);
    }
}