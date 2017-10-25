package aisgnatura;
/**
 * @author jbromero
 */
public class Asignatura {
    private String nombre;
    private int creditos;
    
    Carrera carrera;
    
    public Asignatura(Carrera c){
        nombre = "Informatica";
        creditos = 5;
        carrera = c;
    }
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establacer_creditos(int cre){
        creditos = cre;
    }
    
    public int obtener_creditos(){
        return creditos;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Asignatura\nNombre: %s\nCreditos: %d\n%s",obtener_nombre(),obtener_creditos(),carrera);
        return cadena;
    }
}
