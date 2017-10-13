package ejemplos2;

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
    public double obtener_veloidad_procesador(){
        return velocidad_procesador;
    }
}
