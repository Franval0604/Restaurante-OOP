
package projectone;


public class Main {
    

    public static void main(String[] args) {
       
        Comensales comensal1 = new Comensales(124,32);
        System.out.println("Hola soy un comensal y mi mesa es: " + comensal1.getNroDeMesa());
        
        
        Empleado mesero = new Empleado("Mesero", "Juan", 900, 1400, 2100, 2);
        System.out.println("Hola, soy un mesero y entro a las: " + mesero.getHorarioEntrada());
        
        Restaurante restaurante = new Restaurante("Avénida Genérica", 261, 500, "Palmeritas");
        restaurante.getTelefono();
        System.out.println("Nombre del restaurante: " + restaurante.nombre);
       
    }
   
    
}
