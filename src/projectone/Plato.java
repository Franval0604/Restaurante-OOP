
package projectone;


public class Plato {
   private String nombres;
   private int precios;
   private String ingredientes;
   private  String recetas;

    public Plato(String nombres, int precios, String ingredientes, String recetas) {
        this.nombres = nombres;
        this.precios = precios;
        this.ingredientes = ingredientes;
        this.recetas = recetas;
    }
    
    
    
    public void mostrarIngredientes() { //receta sin proporciones
            System.out.println("nombre de el plato:" +nombres+ "ingredientes:"+ ingredientes);
    
}
    
    public void mostrarIngredientes(boolean conCantidades ) {
             if (conCantidades) {
            System.out.println("Ingredientes detallados del plato " + nombres + ": 200g de arroz, 1 cucharadita de sal, 500ml de agua.");
        } else {
            mostrarIngredientes(); // sino, muestra receta sin proporciones
        }
    
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

    public String getRecetas() {
        return recetas;
    }

    public void setRecetas(String recetas) {
        this.recetas = recetas;
    }
    
    
    
}
