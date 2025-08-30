
package projectone;

/**
 *
 * @author estudiante
 */
public class Empleado {
    String puesto;
    String Nombre;
    int salario;
    int horarioEntrada;
    int horarioSalida;
    int añosDeExperiencia;

    public Empleado(String puesto, String Nombre, int salario, int horarioEntrada, int horarioSalida, int añosDeExperiencia) {
        this.puesto = puesto;
        this.Nombre = Nombre;
        this.salario = salario;
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
        this.añosDeExperiencia = añosDeExperiencia;
    }

    
    
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(int horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public int getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(int horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }
    
    public void MarcarEntrada(int horarioEntrada) {
        System.out.println("Hola soy un Empleado y entro a las: " + horarioEntrada);
}
    
    
    
}

