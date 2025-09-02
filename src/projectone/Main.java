package projectone;

import java.util.ArrayList;

// Los salarios están en dólares

public class Main {
    
    public static void main(String[] args) {
       
        ArrayList<Empleado> empleados = new ArrayList<>();
        Cocinero cocinero1 = new Cocinero("Cocinero", "David", 500, "19:00", "23:00", 4);
        empleados.add(cocinero1);
        Mesero mesero1 = new Mesero("Mesero", "Javier", 800, "18:30", "22:30", 7);
        empleados.add(mesero1);
        Mesero mesero2 = new Mesero("Mesero", "Luciano", 600, "18:30", "22:30", 6);
        empleados.add(mesero2);
        Cocinero cocinero2 = new Cocinero("Cocinero", "Maria", 550, "19:00", "23:00", 6);
        empleados.add(cocinero2);
        Comensales comensal1 = new Comensales(21, 7);
        Comensales comensal2 = new Comensales(17, 0);
        
        System.out.println( cocinero1.getPuesto() + " - Nombre: " + cocinero1.nombre + " - registró su entrada a las " + cocinero1.horarioEntrada);
        System.out.println( cocinero2.getPuesto() + " - Nombre: " + cocinero2.nombre + " - registró su entrada a las " + cocinero2.horarioEntrada);
        System.out.println( mesero1.getPuesto() + " - Nombre: " + mesero1.nombre + " - registró su entrada a las " + mesero1.horarioEntrada);
        System.out.println( mesero2.getPuesto() + " - Nombre: " + mesero2.nombre + " - registró su entrada a las " + mesero2.horarioEntrada);
        System.out.println("Un comensal registró un pedido para consumir en el local (Nro de Pedido: " + comensal1.reservacion + ") para la mesa: " + comensal1.nroDeMesa);
        System.out.println("Un comensal registró un pedido a domicilio (Nro de Pedido: " + comensal2.reservacion);
        
        System.out.println("Actividad de emplados");
        for (Empleado e : empleados) {
            e.trabajar();
        }
    }
   
    
}
