package herencias;
import herencia_ejemplo.*;
/**
 * @author reroes
 */
public class Herencias {
    public static void main(String[] args) {
        Asignatura a[] = new Asignatura[2];
        a[0] = new Asignatura("Programacion","Comun",100);
        a[1] = new Asignatura("\nLiterarua","Troncal",300);
        Estudiante e = new Estudiante("René", "Elizalde", 33, a);
        System.out.println(e);
        
        /*Profesor p = new Profesor(1000.1);
        System.out.println(p.getNombre());
        
        Profesor p1 = new Profesor();
        System.out.println(p1.getNombre());
        
        Profesor p2 = new Profesor("Luis","Albares",35,3000.2);
        System.out.println(p2);*/
        
        
    }
}
