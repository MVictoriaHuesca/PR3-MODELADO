import java.util.ArrayList;
import java.util.List;

public class Refugio{
    private float liquidez;
    private List<Animal> animalesRegistrados;
    private List<Animal> animalesRefugiados;

    public Refugio(float liquidez) {
        this.liquidez = liquidez;
        this.animalesRegistrados = new ArrayList<>();
        this.animalesRefugiados = new ArrayList<>();
    }

//----------getters/setters--------------

    public double getLiquidez() {
        return liquidez;
    }

    public void setLiquidez(float liquidez) {
        this.liquidez = liquidez;
    }

    public List<Animal> getAnimalesRegistrados() {
        return animalesRegistrados;
    }

    public List<Animal> getAnimalesRefugiados() {
        return animalesRefugiados;
    }

//----------métodos--------------

    public void registrarAnimal(Animal a) {
        animalesRegistrados.add(a);
        if (a.getEstado() == EstadoAnimal.DISPONIBLE) {
            animalesRefugiados.add(a);
        }
        System.out.println("Animal registrado: " + a);
    }

    public void adoptarAnimal(Animal a) {
        if (animalesRefugiados.contains(a)) {
            animalesRefugiados.remove(a);
            a.setEstadoAnimal(EstadoAnimal.ADOPTADO);
            System.out.println("Animal adoptado: " + a);
        } else {
            System.out.println("El animal no está disponible para adopción.");
        }
    }
}
