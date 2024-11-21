import java.util.*;

public class Animal {
    private Date nacimiento;
    private EstadoAnimal estado;

    public Animal (Date nacimiento, EstadoAnimal estado){
        this.nacimiento = nacimiento;
        this.estado = estado;
    }

    //----------- getters -----------
    public Date getNacimiento(){
        return nacimiento;
    }

    public EstadoAnimal getEstado(){
        return estado;
    }

    //----------- setters -----------
    public void setNacimiento(Date nacimiento){
        this.nacimiento = nacimiento;
    }

    public void setEstadoAnimal(EstadoAnimal estado){
        this.estado = estado;
    }
}