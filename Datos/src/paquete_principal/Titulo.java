package paquete_principal;
/**
 * @author jbromero
 */
public class Titulo {
    private String nombre;
    private String nombre_universidad;
    
    public void establecer_nombreT(String nom){
        nombre = nom;
    }
    
    public String obtener_nombreT(){
        return nombre;
    }
    
    public void establecer_nombre_universidad(String nom_uni){
        nombre_universidad = nom_uni;
    }
    
    public String obtener_nombre_universidad(){
        return nombre_universidad;
    }
    
    @Override
    public String toString (){
        String cadena = String.format("%s - %s",obtener_nombreT(), obtener_nombre_universidad());
        return cadena;
    }
}
