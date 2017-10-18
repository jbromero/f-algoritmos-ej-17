package personal_docente;
import institucion.Asignatura;
import paquete_principal.*;
/**
 * @author jbromero
 */
public class Principal {
    public static void main(String[] args) {
        Docente a = new Docente();
        Docente b = new Docente();
        Asignatura a1 = new Asignatura();
        Asignatura a2 = new Asignatura();
        Asignatura b1 = new Asignatura();
        Asignatura b2 = new Asignatura();
        Titulo t1 = new Titulo();
        Titulo t2 = new Titulo();
        Titulo u1 = new Titulo();
        Titulo u2 = new Titulo();
        
        a.establecer_nombre("Luis V.");
        a.establecer_apellido("Perez J.");
        a1.establecer_nombreA("Matemáticas");
        a1.establecer_credito(8);
        a.establecer_asignatura_1(a1);
        a2.establecer_nombreA("Física");
        a2.establecer_credito(6);
        a.establecer_asignatura_2(a2);
        t1.establecer_nombreT("Licenciado en Físico Matemáticas");
        t1.establecer_nombre_universidad("Universidad Politécnica");
        a.establecer_titulo_tercer_nivel(t1);
        t2.establecer_nombreT("Magister en Docencia Matemática");
        t2.establecer_nombre_universidad("Universidad Valenciana");
        a.establecer_titulo_cuarto_nivel(t2);
        
        System.out.println(a+"\n");
        
        b.establecer_nombre("Ana M.");
        b.establecer_apellido("Velez P.");
        b1.establecer_nombreA("Sociales");
        b1.establecer_credito(9);
        b.establecer_asignatura_1(b1);
        b2.establecer_nombreA("Literatura");
        b2.establecer_credito(10);
        b.establecer_asignatura_2(b2);
        u1.establecer_nombreT("Licenciado en Ciencias Sociales");
        u1.establecer_nombre_universidad("Universidad Salesiana");
        b.establecer_titulo_tercer_nivel(u1);
        u2.establecer_nombreT("Magister en Docencia Social");
        u2.establecer_nombre_universidad("Universidad Cataluña");
        b.establecer_titulo_cuarto_nivel(u2);
        
        System.out.println(b);
    }
}
