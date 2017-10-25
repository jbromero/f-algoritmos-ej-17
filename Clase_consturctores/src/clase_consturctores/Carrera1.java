package clase_consturctores;

/**
 * @author jbromero
 */
public class Carrera1 {
    private String nombre;
    private String modalidad;
    
    public Carrera1(){
        modalidad = "distancia";
    }
    
    public Carrera1(String md){
        modalidad = md;
    }
    
    public Carrera1(String md, String n){
        modalidad = md;
        nombre = n;
    }
    public void establecer_nombre(String n){
        nombre = n;
    }
    
    public void establecer_modalidad(String n){
        modalidad = n;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public String obtener_modalidad(){
        return modalidad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Modalidad %s - Carrera %s\n",obtener_modalidad(), obtener_nombre());
        return cadena;
    }

}
