import java.util.ArrayList;
import java.util.List;

public class Refugio{
    // Atributo de la clase
    private float liquidez;

    // Variables que representan las relaciones
    private List<Animal> animalesRegistrados;
    private List<Animal> animalesRefugiados;
    private List<Socio> sociosRefugio;

    // Constructor
    public Refugio() {
        this.liquidez = 0;
        this.animalesRegistrados = new ArrayList<>();
        this.animalesRefugiados = new ArrayList<>();
        this.sociosRefugio = new ArrayList<>();
        System.out.println("Se ha creado el refugio correctamente.");
    }

//----------getters/setters--------------

    public float getLiquidez() { // Visibilidad pública para que se le pueda llamar desde otras clases
        return liquidez;
    }

    public void setLiquidez(float liquidez) { // Visibilidad pública para que se le pueda llamar desde otras clases
        assert(liquidez >= 0);
        this.liquidez = liquidez;
    }

    public List<Animal> getAnimalesRegistrados() { // Visibilidad pública para que se le pueda llamar desde otras clases
        return animalesRegistrados;
    }

    public List<Animal> getAnimalesRefugiados() { // Visibilidad pública para que se le pueda llamar desde otras clases
        return animalesRefugiados;
    }

    private List<Socio> getSociosRefugio() {
        return sociosRefugio;
    }

//-----------Métodos-------------

    public void registrar(Animal a) {
        assert(a != null);
        animalesRegistrados.add(a); // Añadimos el animal a la lista de registrados 
        animalesRefugiados.add(a); // Añadimos el animal a la lista de refugiados 
        a.setEstado(EstadoAnimal.DISPONIBLE); // Cambiamos el estado del animal a disponible       
        System.out.println("Animal registrado correctamente en el refugio.");
    }    
}