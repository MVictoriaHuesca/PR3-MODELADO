import java.util.ArrayList;
import java.util.List;

public class Refugio{
    private float liquidez;
    private List<Animal> animalesRegistrados;
    private List<Animal> animalesRefugiados;
    private List<Socio> sociosRefugio;

    public Refugio() {
        this.liquidez = 0;
        this.animalesRegistrados = new ArrayList<>();
        this.animalesRefugiados = new ArrayList<>();
        this.sociosRefugio = new ArrayList<>();
        System.out.println("Se ha creado el refugio correctamente.");
    }

//----------getters/setters--------------

    public float getLiquidez() {
        return liquidez;
    }

    public void setLiquidez(float liquidez) {
        assert(liquidez >= 0);
        this.liquidez = liquidez;
    }

    public List<Animal> getAnimalesRegistrados() {
        return animalesRegistrados;
    }

    public List<Animal> getAnimalesRefugiados() {
        return animalesRefugiados;
    }

    private List<Socio> getSociosRefugio() {
        return sociosRefugio;
    }

//----------métodos--------------

    public void registrar(Animal a) {
        assert(a != null);
        animalesRegistrados.add(a);
        animalesRefugiados.add(a);
        a.setEstado(EstadoAnimal.DISPONIBLE);        
        System.out.println("Animal registrado correctamente en el refugio.");
    }

    
}
