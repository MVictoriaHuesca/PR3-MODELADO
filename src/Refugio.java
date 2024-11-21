import java.util.ArrayList;
import java.util.List;

public class Refugio{
    private float liquidez;
    private List<Animal> animalesRegistrados;
    private List<Animal> animalesRefugiados;
    private List<Socio> sociosRefugio;

    public Refugio(float liquidez) {
        this.liquidez = liquidez;
        this.animalesRegistrados = new ArrayList<>();
        this.animalesRefugiados = new ArrayList<>();
        this.sociosRefugio = new ArrayList<>();
    }

//----------getters/setters--------------

    public float getLiquidez() {
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

    public List<Socio> getSociosRefugio() {
        return sociosRefugio;
    }

//----------métodos--------------

    public void registrar(Animal a) {
        animalesRegistrados.add(a);
        animalesRefugiados.add(a);
        a.setEstado(EstadoAnimal.DISPONIBLE);        
        System.out.println("Animal registrado correctamente.");
    }

    /* QUÉ HACE ESTO AQUI?
    public void adoptar(Animal a) {
        if (animalesRefugiados.contains(a)) {
            animalesRefugiados.remove(a);
            a.setEstado(EstadoAnimal.ADOPTADO);
            System.out.println("Animal adoptado");
        } else {
            System.out.println("El animal no está disponible para adopción.");
        }
    }
    */

    
}
