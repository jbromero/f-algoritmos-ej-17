package aisgnatura;
/**
 * @author jbromero
 */
public class Principal {
    public static void main(String[] args) {
        Carrera c = new Carrera("Contabilidad","presencial");
        Carrera c2 = new Carrera("Economia","distancia");
        
        Asignatura a = new Asignatura(c);
        Asignatura a2 = new Asignatura(c2);
        
        System.out.println(a);
        System.out.println(a2);
    }
}
