package paquete_espacio_fisicos;

/**
 * @author jbromero
 */
public class Edificio {
    private String nombre;
    private String direccion;
    private String provincia;
    private int valor;

    public Edificio(String nom, String dir, String pro, int val) {
        nombre = nom;
        direccion = dir;
        provincia = pro;
        valor = val;
    }
    
    public void establecer_nombre(String nom) {
        nombre = nom;
    }
    
    public String obtener_nombre() {
        return nombre;
    }
    
    public void establecer_direccion(String dir) {
        direccion = dir;
    }
    
    public String obtener_direccion() {
        return direccion;
    }
    
    public void establecer_provincia(String pro) {
        provincia = pro;
    }
    
    public String obtener_provincia() {
        return provincia;
    }
    
    public void establecer_valor(int val) {
        valor = val;
    }
    
    public int obtener_valor() {
        return valor;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s\n(direccion %s - %s - %d)",obtener_nombre(),obtener_direccion(),obtener_provincia(),obtener_valor());
        return cadena;
    }
}
