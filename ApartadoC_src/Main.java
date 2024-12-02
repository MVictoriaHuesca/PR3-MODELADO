import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        // Creo una fecha actual y un refugio
        LocalDate fecha = LocalDate.of(2023,11,28);
        LocalDate fecha2 = LocalDate.of(2024,5,14);
        LocalDate fecha3 = LocalDate.of(2022,12,25);
        Refugio refugio = new Refugio();
        System.out.println();
        //Creamos un animal y un adoptante
        Animal animal = new Animal(fecha2, refugio);
        Animal animal2 = new Animal(fecha3, refugio);
        System.out.println("Numero total de animales registrados en el refugio: " + refugio.getAnimalesRegistrados().size());
        System.out.println();
        Socio adoptante = new Socio(fecha, refugio, true, false, false);
        Socio adoptante2 = new Socio(fecha, refugio, true, false, false);
        Socio voluntario = new Socio(fecha, refugio, false, false, true);
        System.out.println("Numero total de animales refugiados: " + refugio.getAnimalesRefugiados().size());
        adoptante.getAdoptante().adoptar(animal, voluntario.getVoluntario()); 
        adoptante.getAdoptante().adoptar(animal2, voluntario.getVoluntario()); 
        System.out.println("Numero de adopciones del adoptante1: " + adoptante.getAdoptante().getAdopciones().size());
        System.out.println("Numero total de animales refugiados: " + refugio.getAnimalesRefugiados().size());
        System.out.println();
        adoptante2.getAdoptante().adoptar(animal, voluntario.getVoluntario());
        System.out.println("Numero de adopciones del adoptante2: " + adoptante2.getAdoptante().getAdopciones().size()); // Esta va a salir null
        System.out.println();
        Socio donante = new Socio(fecha, refugio, false, true, false);
        donante.getDonante().donar(950);
        System.out.println();
        donante.getDonante().donar(50);
        System.out.println("Numero total de donaciones del donante1: " + donante.getDonante().getDonaciones().size()); 
        System.out.println();
    }
}
