
package projectone;


public class Restaurante {
   private String direccion;
   private int telefono;
   private int dimensiones;
   public String nombre;

    public Restaurante(String direccion, int telefono, int dimensiones, String nombre) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.dimensiones = dimensiones;
        this.nombre = nombre;
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





