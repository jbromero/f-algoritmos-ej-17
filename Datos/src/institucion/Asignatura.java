package institucion;
/**
 * @author jbromero
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    
    public void establecer_nombreA(String nom){
        nombre = nom;
    }
    
    public String obtener_nombreA(){
        return nombre;
    }
    
    public void establecer_credito(int cre){
        creditos = cre;
    }
    
    public int obtener_credito(){
        return creditos;
    }
    
    @Override
    public String toString (){
        String cadena =String.format("%s con número de créditos %d",obtener_nombreA(), obtener_credito());
        return cadena;
    }
}
