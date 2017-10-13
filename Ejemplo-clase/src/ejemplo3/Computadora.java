package ejemplo3;

import java.util.Locale;

/**
 * @author jbromero
 */
public class Computadora {
    //Variable Global
    private double velocidad_procesador;
    
    //Metodo Set (Estabelcer/Agregar)
    public void establecer_velocidad_procesador(double vel){
        if (vel > 5) {
            velocidad_procesador = 5.0;
        }else{
            velocidad_procesador = vel;
        }
    }
    
    //Metodo Get (Obtener)
    public double obtener_velocidad_procesador(){
        return velocidad_procesador;
    }
    
    //Metodo toString de la clase padre object
    @Override
    public String toString(){
        String cadena = String.format("Computadora con\n"
                + "velocidad %f",obtener_velocidad_procesador());
        //String cadena2 = String.format("Computadora con\n"
        //       + "velocidad %f",velocidad_procesador);
        return cadena;
    }
}