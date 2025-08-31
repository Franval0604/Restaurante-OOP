
package projectone;


public class Plato {
    String nombres;
    int precios;
    String ingredientes;
    String recetas;

    public Plato(String nombres, int precios, String ingredientes, String recetas) {
        this.nombres = nombres;
        this.precios = precios;
        this.ingredientes = ingredientes;
        this.recetas = recetas;
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
