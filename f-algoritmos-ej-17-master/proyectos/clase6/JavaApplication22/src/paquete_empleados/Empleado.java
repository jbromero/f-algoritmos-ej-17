package paquete_empleados;
/**
 * @author jbromero
 */
public class Empleado {
    private String nombres;
    private int edad;
    private int experiencia;
    private int sueldo;

    public Empleado(String nom, int ed, int exp, int sue) {
        nombres = nom;
        edad = ed;
        experiencia = exp;
        sueldo = sue;
    }

    public void establecer_nombres(String nom) {
        nombres = nom;
    }
    
    public String obtener_nombres() {
        return nombres;
    }
    
    public void establecer_edad(int ed) {
        edad = ed;
    }
        
    public int obtener_edad() {
        return edad;
    }
    
    public void establecer_experiencia(int exp) {
        experiencia = exp;
    }
    
    public int obtener_experiencia() {
        return experiencia;
    }
    
    public void establecer_sueldo(int sue) {
        sueldo = sue;
    }
    
    public int obtener_sueldo() {
        return sueldo;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("%s - %d años - %d años experiencia - sueldo $%d\n",obtener_nombres(),obtener_edad(),obtener_experiencia(),obtener_sueldo());
        return cadena;
    }
}
