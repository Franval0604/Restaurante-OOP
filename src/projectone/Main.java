package projectone;

import java.util.ArrayList;

// Los salarios están en dólares

public class Main {
    
    public static void main(String[] args) {
        
        //ejemplo de sobrecarga de metodos 
       Plato plato1 = new Plato("Panqueques", 0, "huevo, azucar, agua, harina",""); 
        plato1.mostrarIngredientes();
        plato1.mostrarIngredientes(true);
        
        Plato plato2 = new Plato("Fideos", 0, "masa, huevos, salsa, harina, aceite, sal", "");
        plato2.mostrarIngredientes();
        plato2.mostrarIngredientes(true);
        
        //segunda forma de de polimorfismo
        //polimorfismo con Cocinero
        Cocinero cocinero3 = new Cocinero("Sopas", "cocinero", "Agustin", 500, "18:00", "23:00", 5);
        Cocinero cocinero4 = new Cocinero("Salsas", "cocinero", "Orlando", 500, "16:00", "23:00", 2);
        //polimorfismo con Mesero
        Mesero mesero3 = new Mesero("Mesero", "Benito", 500, "18:00", "23:00", 4);
        
        Mesero mesero4 = new Mesero("Mesero", "Adolfo", 1200, "18:00", "23:00", 10);
        
        cocinero3.registrarEntradaySalida();
        cocinero4.registrarEntradaySalida();
        mesero3.registrarEntradaySalida();
        mesero4.registrarEntradaySalida();
        
        
        //primera forma de polimorfismo
        ArrayList<Empleado> empleados = new ArrayList<>();
        Cocinero cocinero1 = new Cocinero("Postres","Cocinero", "David", 500, "19:00", "23:00", 4);
        empleados.add(cocinero1);
        Mesero mesero1 = new Mesero("Mesero", "Javier", 800, "18:30", "22:30", 7);
        empleados.add(mesero1);
        Mesero mesero2 = new Mesero("Mesero", "Luciano", 600, "18:30", "22:30", 6);
        empleados.add(mesero2);
        Cocinero cocinero2 = new Cocinero("Pastas","Cocinero", "Maria", 550, "19:00", "23:00", 6);
        empleados.add(cocinero2);
        Comensales comensal1 = new Comensales(21, 7);
        Comensales comensal2 = new Comensales(17, 0);
        
        // Lista de empleados
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(cocinero1);
        listaEmpleados.add(cocinero2);
        listaEmpleados.add(mesero1);
        listaEmpleados.add(mesero2);
        
        
        
        Restaurante restaurante = new Restaurante("Avenida Palacios", "2614859885", 186, "La Buena Mesa", listaEmpleados);
        System.out.println("Lista de empleados: ");
        restaurante.mostrarEmpleados(); //Agregacion de empleados
        
        System.out.println( cocinero1.getPuesto() + " - Nombre: " + cocinero1.nombre + " - registró su entrada a las " + cocinero1.horarioEntrada);
        System.out.println( cocinero2.getPuesto() + " - Nombre: " + cocinero2.nombre + " - registró su entrada a las " + cocinero2.horarioEntrada);
        System.out.println( mesero1.getPuesto() + " - Nombre: " + mesero1.nombre + " - registró su entrada a las " + mesero1.horarioEntrada);
        System.out.println( mesero2.getPuesto() + " - Nombre: " + mesero2.nombre + " - registró su entrada a las " + mesero2.horarioEntrada);
        System.out.println("Un comensal registró un pedido para consumir en el local (Nro de Pedido: " + comensal1.reservacion + ") para la mesa: " + comensal1.nroDeMesa);
        System.out.println("Un comensal registró un pedido a domicilio (Nro de Pedido: " + comensal2.reservacion);
        
        System.out.println("Actividad de empleados");
        for (Empleado e : empleados) {
            e.trabajar();
        }
    }
   
    
}
