/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectone;

/**
 *
 * @author Perla
 */
public class Restaurante {
   private String direccion;
   private int telefono;
   private int dimensiones;

    public Restaurante(String direccion, int telefono, int dimensiones) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.dimensiones = dimensiones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }
   
   
   
   
   
   
}





