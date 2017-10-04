package proyecto1;
import java.util.Scanner;
/**
 * @author jbromero3
 */
public class Proyecto1 {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        int mult=0;
        int multi=0;
        
        System.out.print("Ingrese primer valor: ");
        mult = teclado.nextInt();
        System.out.print("Ingrese segundo valor: ");
        multi = teclado.nextInt();
        
        System.out.print("La multiplicacion es : "+mult*multi);
    }
}
