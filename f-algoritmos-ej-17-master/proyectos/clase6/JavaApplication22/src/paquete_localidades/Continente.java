package paquete_localidades;
/**
 * @author jbromero
 */
public class Continente {
    private String nombre;
    
    public Continente(String nom){
        nombre = nom;
    }
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s",obtener_nombre());
        return cadena;
    }
}
