package projectone;
import java.util.List;


public class Restaurante {
   private String direccion;
   public String telefono;
   public int dimensiones;
   public String nombre;
   private List<Empleado> empleados; //agregación con la clase Empleado


    public Restaurante(String direccion, String telefono, int dimensiones, String nombre, List<Empleado> empleados) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.dimensiones = dimensiones;
        this.nombre = nombre;
        this.empleados = empleados;
       
    }
    
    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(int dimensiones) {
        this.dimensiones = dimensiones;
    }
    
    public String getNombre() {
        return nombre;
    }
    
  public void mostrarEmpleados() {
        System.out.println("Empleados del restaurante " + nombre + ":");
        for (Empleado e : empleados) {
            System.out.println("- " + e.getNombre() + " (" + e.getPuesto() + ")");
    
      
        }
    }
}
   






