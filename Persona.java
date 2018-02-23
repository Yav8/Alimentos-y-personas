/**
 * Clase persona.
 * @author Javier de Cea Domínguez.
 */
public class Persona {
    private String nombre;
    private boolean hombre;
    private int kilogramos;
    private int centimetros;
    private int anos;
    private int totalCalorias;
    
    /**
     * Constructor de la clase Persona.
     * @param nombre El nombre de la persona.
     * @param hombre Indica si la persona es hombre (true) o mujer (false).
     * @param kilogramos El peso (en kilogramos) de la persona.
     * @param centimetros La altura (en centímetros) de la persona.
     * @param anos El número de años de la persona.
     */
    public Persona(String nombre, boolean hombre, int kilogramos, int centimetros, int anos) {
        this.nombre = nombre;
        this.hombre = hombre;
        this.kilogramos = kilogramos;
        this.centimetros = centimetros;
        this.anos = anos;
        totalCalorias = 0;
    }
    
    /**
     * Permite a la persona comer.
     * @param comida Objeto comida que comerá la persona.
     * @return caloriasDeLaComida La cantidad de calorías 
     * que contiene la comida.
     */
    public int comer(Comida comida) {
        int caloriasDeLaComida = -1;
        if((hombre == true && totalCalorias <= ((10 * kilogramos) + (6 * centimetros) + (5 * anos) + 5)) || (hombre == false && totalCalorias <= ((10 * kilogramos) + (6 * centimetros) + (5 * anos) - 161))) {
            caloriasDeLaComida = comida.getCalorias();
            totalCalorias += caloriasDeLaComida;
        }
        else {
            System.out.println("Error: La persona no puede comer más.");
        }
        return caloriasDeLaComida;
    }
    
    /**
     * Permite conocer la cantidad de calorías que ha ingerido
     * una persona.
     * @return totalCalorias El total de calorías que
     * lleva ingerida una persona.
     */
    public int getCaloriasIngeridas() {
        return totalCalorias;
    }
}