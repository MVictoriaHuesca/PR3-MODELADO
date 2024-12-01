import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Creo una fecha actual y un refugio
        Date fecha = new Date();
        Refugio refugio = new Refugio();
        System.out.println();
        //Creamos un animal y un adoptante
        Animal animal1 = new Animal(fecha, refugio);
        Animal animal2 = new Animal(fecha, refugio);
        System.out.println("La lista de animales registrados en el refugio es: " + refugio.getAnimalesRegistrados());
        Socio adoptante1 = new Socio(fecha, refugio, false, false, true);
        Socio adoptante2 = new Socio(fecha, refugio, false, false, true);
        Socio voluntario = new Socio(fecha, refugio, false, true, false);
        Socio donanteAdoptanteVoluntario = new Socio(fecha, refugio, true, true, true);
        adoptante1.adoptar(animal1, voluntario); 
        System.out.println("La lista de adopciones del adoptante1 es: " + adoptante1.getAdopciones());
        adoptante2.adoptar(animal1, voluntario);
        System.out.println("La lista de adopciones del adoptante2 es: " + adoptante2.getAdopciones()); // Esta va a salir null
        System.out.println();
        Socio donante = new Socio(fecha, refugio, true, false, false);
        donante.donar(950);
        donante.donar(50);
        donanteAdoptanteVoluntario.donar(100);
        System.out.println();
        donanteAdoptanteVoluntario.adoptar(animal2, donanteAdoptanteVoluntario);
        System.out.println("La lista de adopciones del donanteAdoptanteVoluntario es: " + donanteAdoptanteVoluntario.getAdopciones());
        System.out.println("La lista de animales en el refugio es: " + refugio.getAnimalesRefugiados());
        System.out.println();
    }
}
