package paquete_localidades;
/**
 * @author jbromero
 */
public class Provincia {
    private String nombre;
    private Pais pais;

    public Provincia(String nom, Pais p) {
        nombre = nom;
        pais = p;
    }
    
    public void establecer_nombre(String nom) {
        nombre = nom;
    }
    
    public String obtener_nombre() {
        return nombre;
    }
    
    public void establcer_pais(Pais p){
        pais = p;
    }
    
    public Pais obtener_pais() {
        return pais;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s/%s",obtener_pais(),obtener_nombre());
        return cadena;
    }
}
