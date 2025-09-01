package projectone;

// Los salarios están en dólares

public class Main {
    
    public static void main(String[] args) {
       
        Empleado mesero1 = new Empleado("Mesero", "David", 500, "19:00", "23:00", 4 );
        Empleado cocinero1 = new Empleado("Cocinero", "Javier", 800, "18:30", "22:30", 7 );
        Comensales comensal1 = new Comensales(21, 7);
        
        System.out.println( cocinero1.getPuesto() + " - Nombre: " + cocinero1.nombre + " - registró su entrada a las " + cocinero1.horarioEntrada);
        System.out.println( mesero1.getPuesto() + " - Nombre: " + mesero1.nombre + " - registró su entrada a las " + mesero1.horarioEntrada);
        System.out.println("Un comensal registró un pedido (Nro de Pedido: " + comensal1.reservacion + ") para la mesa: " + comensal1.nroDeMesa);
    }
   
    
}
