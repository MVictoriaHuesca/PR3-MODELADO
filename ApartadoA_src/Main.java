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
        System.out.println("Número total de animales en el refugio: " + refugio.getAnimalesRegistrados().size() + "\n");
        
        Adoptante adoptante = new Adoptante(fecha, refugio);
        Adoptante adoptante2 = new Adoptante(fecha, refugio);
        Voluntario voluntario = new Voluntario(fecha, refugio);
        System.out.println("Número de animales refugiados: " + refugio.getAnimalesRefugiados().size());
        adoptante.adoptar(animal, voluntario);         
        adoptante.adoptar(animal2, voluntario); 
        System.out.println("Número de adopciones del adoptante1: " + adoptante.getAdopciones().size());
        System.out.println("Número de animales refugiados: " + refugio.getAnimalesRefugiados().size() + "\n");
        
        adoptante2.adoptar(animal, voluntario);
        System.out.println("Número de adopciones del adoptante2: " + adoptante2.getAdopciones().size() + "\n"); 
        
        Donante donante = new Donante(fecha, refugio);
        donante.donar(950);
        System.out.println();
        donante.donar(50);
        System.out.println("Número total de donaciones del donante1: " + donante.getDonaciones().size() + "\n"); 
    }
}
