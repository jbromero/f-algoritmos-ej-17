package clase_consturctores;
/**
 * @author jbromero
 */
public class Carrera {
    private String nombre;
    private String modalidad;
    
    public Carrera(String md){
        modalidad = md;
    }
    
    public Carrera(String md, String x){
        modalidad = md;
        nombre = x;
    }
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_modalida(String mod){
        modalidad = mod;
    }
    
    public String obtener_modalidad(){
        return modalidad;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("La carrera es: %s\nLa modalida es: %s", obtener_nombre(),obtener_modalidad());
        return cadena;
    }
}