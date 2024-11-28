import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Creo una fecha actual y un refugio
        Date fecha = new Date();
        Refugio refugio = new Refugio();

        //Creamos un animal y un adoptante
        Animal animal = new Animal(fecha);
        refugio.registrar(animal);
        Adoptante adoptante = new Adoptante(fecha, refugio);
        Adoptante adoptante2 = new Adoptante(fecha, refugio);
        Voluntario voluntario = new Voluntario(fecha, refugio);
        adoptante.adoptar(animal, voluntario);
        adoptante2.adoptar(animal, voluntario);
        Donante donante = new Donante(fecha, refugio);
        donante.donar(950);
        donante.donar(50);
    }
}
