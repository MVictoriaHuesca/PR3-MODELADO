import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        // Creo varias fechas y un refugio
        LocalDate fecha = LocalDate.of(2023,11,28);
        LocalDate fecha2 = LocalDate.of(2024,5,14);
        LocalDate fecha3 = LocalDate.of(2022,12,25);
        Refugio refugio = new Refugio();
        System.out.println();
        //Creamos un animal y un adoptante
        Animal animal = new Animal(fecha2, refugio);
        Animal animal2 = new Animal(fecha3, refugio);
        System.out.println("Numero total de animales registrados en el refugio: " + refugio.getAnimalesRegistrados().size()+"\n");
        
        Socio adoptante = new Socio(fecha, refugio, true, false, false);
        Socio adoptante2 = new Socio(fecha, refugio, true, false, false);
        Socio voluntario = new Socio(fecha, refugio, false, false, true);
        System.out.println("Numero total de animales refugiados: " + refugio.getAnimalesRefugiados().size());
        adoptante.getAdoptante().adoptar(animal, voluntario.getVoluntario()); 
        adoptante.getAdoptante().adoptar(animal2, voluntario.getVoluntario()); 
        System.out.println("Numero de adopciones del adoptante1: " + adoptante.getAdoptante().getAdopciones().size());
        System.out.println("Numero total de animales refugiados: " + refugio.getAnimalesRefugiados().size()+"\n");
        
        adoptante2.getAdoptante().adoptar(animal, voluntario.getVoluntario());
        System.out.println("Numero de adopciones del adoptante2: " + adoptante2.getAdoptante().getAdopciones().size()+"\n"); // Esta va a salir null
        
        Socio donante = new Socio(fecha, refugio, false, true, false);
        donante.getDonante().donar(950);
        System.out.println();
        donante.getDonante().donar(50);
        System.out.println("Numero total de donaciones del donante1: " + donante.getDonante().getDonaciones().size()); 
        System.out.println("\n---------------------------------------------"); 
        System.out.println("Ahora vamos a probar el cambio en la asignación de roles del socio Voluntario \n");
        Animal animal3 = new Animal(fecha3, refugio);
        Animal animal4 = new Animal(fecha2, refugio);
        System.out.println();
        donante.setRolAdoptante(true);
        System.out.println("Donante ha adoptado el rol de Adoptante");
        System.out.println(donante.getRoles()+"\n");
        
        donante.getAdoptante().adoptar(animal3, voluntario.getVoluntario());
        donante.setRolAdoptante(false);
        System.out.println("Donante se ha desprendido del rol de Adoptante");
        try {
            donante.getAdoptante().adoptar(animal4, voluntario.getVoluntario());
        } catch (Exception e) {
            System.out.println("ERROR: Este socio no tiene permisos de Adoptante");
        }
        
        System.out.println(donante.getRoles()+"\n");
    }
}
