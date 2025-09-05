
package projectone;


public class Plato {
   private String nombres;
   private int precios;
   private String ingredientes;
   private  String proporciones;
   private Cocinero Cocinero; //asociando plato a cocinero

    public Plato(String nombres, int precios, String ingredientes, String recetas) {
        this.nombres = nombres;
        this.precios = precios;
        this.ingredientes = ingredientes;
        this.proporciones = recetas;
    }
    
    
    
    public void mostrarIngredientes() { //receta sin proporciones
            System.out.println("Nombre del plato: " + nombres + ", ingredientes: "+ ingredientes);
    
}
    
    public void mostrarIngredientes(boolean conCantidades ) {
             if (conCantidades) {
            System.out.println("Ingredientes detallados del plato " + nombres + "proporciones:"+ proporciones);
        } else {
            mostrarIngredientes(); // sino, muestra receta sin proporciones
        }
    
}
    
    //getters y setters

    public Cocinero getCocinero() {
        return Cocinero;
    }

    public void setCocinero(Cocinero Cocinero) {
        this.Cocinero = Cocinero;
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getPrecios() {
        return precios;
    }

    public void setPrecios(int precios) {
        this.precios = precios;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getProporciones() {
        return proporciones;
    }

    public void setProporciones(String recetas) {
        this.proporciones = recetas;
    }
    
    
    
}
