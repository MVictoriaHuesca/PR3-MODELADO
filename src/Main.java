import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Creo una fecha actual y un refugio
        Date fecha = new Date();
        Refugio refugio = new Refugio();
        System.out.println();
        //Creamos un animal y un adoptante
        Animal animal = new Animal(fecha, refugio);
        System.out.println("Numero total de animales en el refugio: " + refugio.getAnimalesRegistrados().size());
        System.out.println();
        Adoptante adoptante = new Adoptante(fecha, refugio);
        Adoptante adoptante2 = new Adoptante(fecha, refugio);
        Voluntario voluntario = new Voluntario(fecha, refugio);
        System.out.println("Lista de animales refugiados: " + refugio.getAnimalesRefugiados().size());
        adoptante.adoptar(animal, voluntario); 
        System.out.println("Numero de adopciones del adoptante1: " + adoptante.getAdopciones().size());
        System.out.println("Lista de animales refugiados: " + refugio.getAnimalesRefugiados().size());
        System.out.println();
        adoptante2.adoptar(animal, voluntario);
        System.out.println("Numero de adopciones del adoptante2: " + adoptante2.getAdopciones().size()); // Esta va a salir null
        System.out.println();
        Donante donante = new Donante(fecha, refugio);
        donante.donar(950);
        System.out.println();
        donante.donar(50);
        System.out.println("Numero total de donaciones del donante1: " + donante.getDonaciones().size()); 
        
    }
}
