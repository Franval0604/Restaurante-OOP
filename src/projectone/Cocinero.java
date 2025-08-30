
package projectone;


 
public class Cocinero extends Empleado {
   private String Especialidad;

    public Cocinero(String Especialidad, String puesto, String Nombre, int salario, int horarioEntrada, int horarioSalida, int añosDeExperiencia) {
        super(puesto, Nombre, salario, horarioEntrada, horarioSalida, añosDeExperiencia);
        this.Especialidad = Especialidad;
    }

    
    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

   
    
    
    
    
}
