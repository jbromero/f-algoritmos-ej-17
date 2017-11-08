package paquete_localidades;
/**
 * @author jbromero
 */
public class Pais {
    private String nombre;
    private Continente continente;
    
    public Pais(String nom, Continente con){
        nombre = nom;
        continente = con;
    }   
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_continente(Continente con) {
        continente = con;
    }
    
    public Continente obtener_continente() {
        return continente;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s/%s",obtener_continente(),obtener_nombre());
        return cadena;
    }
}
