package clase_consturctores;
/**
 * @author jbromero
 */
public class Principal {
    public static void main(String[] args) {
        Carrera c = new Carrera("Electronica");
        Carrera c1 = new Carrera("semipresencial","sistemas");
        
        System.out.println(c.obtener_modalidad());
        
        System.out.println(c1.obtener_modalidad());
        c1.establecer_modalida("distancia");
        System.out.println(c1.obtener_modalidad());
        c1.establecer_modalida(c1.obtener_modalidad().toUpperCase());
        System.out.println(c1.obtener_modalidad());
    }
}
