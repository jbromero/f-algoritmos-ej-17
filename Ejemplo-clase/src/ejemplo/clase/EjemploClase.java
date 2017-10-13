package ejemplo.clase;

/**
 * @author jbromero
 */
public class EjemploClase {
    public static void main(String[] args) {
        Computadora c = new Computadora();
        System.out.println(c.velocidad_procesador);
        c.velocidad_procesador=10.2;
    }
}
