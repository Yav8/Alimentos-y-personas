/**
 * Clase comida.
 * @author Javier de Cea Domínguez.
 */
public class Comida {
    private String nombre;
    private int calorias;
    
    /**
     * Constructor de la clase comida.
     * @param nombre El nombre de la comida.
     * @param calorias La cantidad de calorías que tiene la comida.
     */
    public Comida(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
    }
    
    /**
     * Obtiene el nombre de la comida.
     * @return nombre El nombre de la comida.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Obtiene el número de calorías.
     * @return calorias El número de calorías.
     */
    public int getCalorias() {
        return calorias;
    }
}