package projectone;

import java.util.ArrayList;

// Los salarios están en dólares

public class Main {
    
    public static void main(String[] args) {
       
        
        //segunda forma de de polimorfismo
        //polimorfismo con Cocinero
        Cocinero cocinero1 = new Cocinero("Panqueques", "cocinero", "Agustin", 500, "18:00", "23:00", 5);
        Cocinero cocinero2 = new Cocinero("Fideos", "cocinero", "Orlando", 500, "16:00", "22:00", 2);
        //polimorfismo con Mesero
        Mesero mesero1 = new Mesero("Mesero", "Benito", 500, "18:00", "23:00", 4);
        Mesero mesero2 = new Mesero("Mesero", "Adolfo", 1200, "18:00", "23:00", 10);
        
        
         ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(cocinero1);
        empleados.add(cocinero2);
        empleados.add(mesero1);
        empleados.add(mesero2);
        
        System.out.println("");
        System.out.println("registro de personal(hoy)");
        cocinero1.registrarEntradaySalida();
        cocinero2.registrarEntradaySalida();
        mesero1.registrarEntradaySalida();
        mesero2.registrarEntradaySalida();
        
        
        
        Restaurante restaurante = new Restaurante("Avenida Palacios", "2614859885", 186, "La Buena Mesa", empleados);
        System.out.println("Lista de empleados: ");
        restaurante.mostrarEmpleados(); //Agregacion de empleados
        
         //ejemplo de polimorfismo 
        System.out.println("");
        System.out.println("Platos de hoy:");
       Plato plato1 = new Plato("Panqueques", 400,"Agua,Sal,harina,aceite,huevos","una taza de agua,pizca de sal,una cucharadita de aceite, dos huevos"); 
        plato1.mostrarIngredientes();
        plato1.mostrarIngredientes(true);
        
        Plato plato2 = new Plato("Fideos con salsa", 500, " huevos, salsa, harina, aceite, sal", "2 huevos, salsa ,200gr harina,2 cucharadas aceite, 1 cucharadita sal");
        plato2.mostrarIngredientes();
        plato2.mostrarIngredientes(true);
        
        
        System.out.println("");//mostrar reservaciones con o sin asignacion de mesa, segundo polimorfismo
        Comensales comensal1 = new Comensales(21, 7);
        Comensales comensal2 = new Comensales(17, 0);
        System.out.println("Reservaciones de el dia:");
        
        comensal2.reservar();
        comensal1.reservar(true);
        
        
        System.out.println("");
        System.out.println("Actividad de empleados:");
        for (Empleado e : empleados) {
            e.trabajar();
        }
    }
   
    
}
