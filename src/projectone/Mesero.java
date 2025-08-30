/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectone;

/**
 *
 * @author estudiante
 */
public class Mesero extends Empleado {
    int mesasAsignadas;

    public Mesero(int mesasAsignadas, String puesto, String Nombre, int salario, int horarioEntrada, int horarioSalida, int añosDeExperiencia) {
        super(puesto, Nombre, salario, horarioEntrada, horarioSalida, añosDeExperiencia);
        this.mesasAsignadas = mesasAsignadas;
    }

   
    
    
    
    public int getMesasAsignadas() {
        return mesasAsignadas;
    }

    public void setMesasAsignadas(int mesasAsignadas) {
        this.mesasAsignadas = mesasAsignadas;
    }
 
   
    
    
}
