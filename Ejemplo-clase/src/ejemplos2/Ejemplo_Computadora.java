package ejemplos2;

/**
 * @author jbromero
 */
public class Ejemplo_Computadora {
    public static void main(String[] args) {
        Computadora c = new Computadora();
        System.out.println(c.obtener_veloidad_procesador());
        c.establecer_velocidad_procesador(5.1);
        System.out.println(c.obtener_veloidad_procesador());
    }
}
