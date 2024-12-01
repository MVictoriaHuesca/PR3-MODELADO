import java.util.*;

public class Socio {
    private Date registro;
    private Refugio refugio;
    private boolean esDonante, esVoluntario, esAdoptante;
    private List<Adopcion> adopciones;
    private List<Donacion> donaciones;

    public Socio(Date registro, Refugio refugio, Boolean esDonante, Boolean esVoluntario, Boolean esAdoptante){
        assert(registro != null && refugio != null);
        this.registro = registro;
        this.refugio = refugio;
        this.esDonante = esDonante;
        this.esVoluntario = esVoluntario;
        this.esAdoptante = esAdoptante;
        adopciones = new LinkedList<Adopcion>();
        donaciones = new LinkedList<Donacion>();
        System.out.println("Se ha registrado el socio correctamente en el sistema, con la fecha de registro: " + registro);
        this.getRoles();
    }

    // METODOS DE ADOPTANTE

    public List<Adopcion> getAdopciones(){
        if(esAdoptante){
            return adopciones;
        } else {
            System.out.println("El socio no tiene permisos para ver las adopciones.");
            return null;
        }
    }

    public void setAdopciones(List<Adopcion> adop){
        assert(adop != null);
        if(esAdoptante){
            this.adopciones = adop;
        } else {
            System.out.println("El socio no tiene permisos para modificar las adopciones.");
        }
    }

    //METODOS DE DONANTE
    private List<Donacion> getDonaciones() {
        if(esDonante){
            return donaciones;
        } else {
            System.out.println("El socio no tiene permisos para ver las donaciones.");
            return null;
        }
    }

    private void setDonaciones(List<Donacion> donaciones){
        assert(donaciones != null);
        if(esDonante){
            this.donaciones = donaciones;
        } else {
            System.out.println("El socio no tiene permisos para modificar las donaciones.");
        }
    }

    private void agregarDonacion(Donacion donacion) {
        assert(donacion != null);
        if(esDonante){
            donaciones.add(donacion);
        } else {
            System.out.println("El socio no tiene permisos para agregar donaciones.");
        }
    }

//----------- METODOS DE SOCIO ---------------

    private Date getRegistro() {
        return registro;
    }

    private void setRegistro(Date registro) {
        assert(registro != null);
        this.registro = registro;
    }  

    private Refugio getRefugio(){
        return refugio;
    }

    private void setRefugio(Refugio refugio){
        assert(refugio != null);
        this.refugio = refugio;
    }

    private boolean getRolVoluntario () {
        return this.esVoluntario;
    }

    private boolean getRolDonante () {
        return this.esDonante;
    }

    private boolean getRolAdoptante () {
        return this.esAdoptante;
    }

    public void setRolVoluntario (boolean b) {
        this.esVoluntario = b;
    }
    
    public void setRolDonante (boolean b) {
        this.esDonante = b;
    }

    public void setRolAdoptante (boolean b) {
        this.esAdoptante = b;
    }

     public void getRoles() { // Imprime por pantalla los roles asignados a un socio concreto
        StringBuilder roles = new StringBuilder("Los roles que tiene el socio son: ");
        boolean tieneRol = false;

        if (esVoluntario) {
            roles.append("Voluntario");
            tieneRol = true;
        }
        if (esDonante) {
            if (tieneRol) roles.append(", ");
            roles.append("Donante");
            tieneRol = true;
        }
        if (esAdoptante) {
            if (tieneRol) roles.append(", ");
            roles.append("Adoptante");
            tieneRol = true;
        }

        // Si no tiene ningún rol
        if (!tieneRol) {
            roles.append("ninguno");
        }

        System.out.println(roles);
    }

    //----------adoptante--------------

    public void adoptar(Animal a, Socio v){ //PREGUNTAR SI PODEMOS CAMBIAR LOS PARÁMETROS DE LA FUNCIÓN
        assert(a != null && v != null);
        if(esAdoptante) {
            if(a.getEstado() == EstadoAnimal.DISPONIBLE) {
                v.tramitarAdopcion(this, a);
            }else{
                System.err.println("Animal no disponible");
            } 
        } else {
            System.out.println("El socio no tiene permisos para adoptar animales.");
        }           
    }

    //----------donante--------------

    public void donar(float c){
        assert(c > 0);
        if(esDonante){
            Donacion donacion = new Donacion(c,new Date());
            agregarDonacion(donacion);
            //Falta agregar liquidez al refugio
            Refugio ref = this.getRefugio();
            ref.setLiquidez(ref.getLiquidez()+c);
            System.out.println("Donación realizada por el donante " + this + ". Cantidad: " + c);
            System.out.println("Nueva liquidez del refugio: " + ref.getLiquidez());
        } else {
            System.out.println("El socio no tiene permisos para donar.");
        }
        
    }

    //----------voluntario--------------

    public void tramitarAdopcion(Socio ad, Animal a) {
        assert(ad != null && a != null);
        if(esVoluntario){
            if (a.getEstado() == EstadoAnimal.DISPONIBLE) {
                Date fecha = new Date();
                Adopcion adop = new Adopcion(fecha, a , ad, this);
                ad.getAdopciones().add(adop);
                a.setAdopcion(adop);
                a.setEstado(EstadoAnimal.ADOPTADO);
                this.getRefugio().getAnimalesRefugiados().remove(a); // Probar si así funciona el borrar animal de la lista de refugiados
                System.out.println("Adopción registrada: Se ha adoptado al animal. Estado actual del animal: " + a.getEstado());
            } else {
                System.out.println("El animal no está disponible para adopción. Estado actual del animal: " + a.getEstado());
            }
        } else {
            System.out.println("El socio no tiene permisos para adoptar animales.");
        }
    }

    public void registrar(Animal a) {
        assert(a != null);
        if(esVoluntario){
            this.getRefugio().registrar(a);
        } else {
            System.out.println("El socio no tiene permisos para registrar animales.");
        }
    }
}
