package ejemplo.clase;

/**
 * @author jbromero
 */
public class Computadora {
    private double velocidad_procesador;
    
    //Metodo Set (Estabelcer)
    public void establecer_velocidad_procesador(double vel){
        velocidad_procesador = vel;
    }
    
    //Metodo Get (Obtener)
    public double obtener_veloidad_procesador(){
        return velocidad_procesador;
    }
}
