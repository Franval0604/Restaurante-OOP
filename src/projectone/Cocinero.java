
package projectone;


public class Cocinero extends Empleado{
    private String especialidad;

    public Cocinero(String especialidad, String puesto, String nombre, int salario, String horarioEntrada, String horarioSalida, int añosDeExperiencia) {
        super(puesto, nombre, salario, horarioEntrada, horarioSalida, añosDeExperiencia);
        this.especialidad = especialidad;
    }

    
    
    // polimorfismo proveniente de empleado
    @Override
    public void registrarEntradaySalida(){
        System.out.println(" Cocinero Nombre: " + nombre + " -(Especialidad: " +getEspecialidad() + ")" + 
                " -ocupó su estación: " + horarioEntrada+ "-y finalizo a las : " + horarioSalida );
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public String getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }
    
    
    
}
    

