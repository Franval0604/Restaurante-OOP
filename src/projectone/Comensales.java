
package projectone;


public class Comensales{
    
    int reservacion;
    int nroDeMesa;
    
   
    
    public Comensales(int reservacion, int nroDeMesa) {
    this.reservacion = reservacion;
    this.nroDeMesa = nroDeMesa;

}
    public void reservar() {
            System.out.println("Un comensal registró un pedido a domicilio (Nro de Pedido: " + reservacion+ "sin mesa asignada todavia");
    
}
  
    public void reservar(boolean Asignacion ) {
             if (Asignacion) {
            System.out.println("Un comensal registró un pedido para consumir en el local (Nro de Pedido: " + reservacion + ") se le asignará la mesa: " + nroDeMesa);
        } else {
            reservar(); 
        }
    
    }       
         
    //getters y setters    
    public int getReservacion() {
        return reservacion;
    }

    public void setReservacion(int reservacion) {
        this.reservacion = reservacion;
    }

    public int getNroDeMesa() {
        return nroDeMesa;
    }

    public void setNroDeMesa(int nroDeMesa) {
        this.nroDeMesa = nroDeMesa;
    }
    
    
                
}
