package paquete_principal;
import institucion.Asignatura;
/**
 * @author jbromero
 */
public class Docente {
    private String nombre;
    private String apellido;
    private Titulo titulo_tercer_nivel;
    private Titulo titulo_cuarto_nivel;
    private Asignatura asignatura_1;
    private Asignatura asignatura_2;
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void establecer_apellido(String ape){
        apellido = ape;
    }
    
    public String obtener_apellido(){
        return apellido;
    }
    
    public void establecer_titulo_tercer_nivel(Titulo n){
        titulo_tercer_nivel = n;
    }
    
    public Titulo obtener_titulo_tercer_nivel(){
        return titulo_tercer_nivel;
    }
    
    public void establecer_titulo_cuarto_nivel(Titulo n){
        titulo_cuarto_nivel = n;
    }
    
    public Titulo obtener_titulo_cuarto_nivel(){
        return titulo_cuarto_nivel;
    }
    
    public void establecer_asignatura_1(Asignatura n){
        asignatura_1 = n;
    }
    
    public Asignatura obtener_asignatura_1(){
        return asignatura_1;
    }
    
    public void establecer_asignatura_2(Asignatura n){
        asignatura_2 = n;
    }
    
    public Asignatura obtener_asignatura_2(){
        return asignatura_2;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Datos del Docente:\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Tiene a su cargo las asignaturas:\n"
                + "Asignatura 1: %s\n"
                + "Asignatura 2: %s\n"
                + "El docente tiene los siguientes títulos académicos:\n"
                + "Titulo 3er nivel: %s\n"
                + "Título 4er nivel: %s",obtener_nombre(),obtener_apellido(),obtener_asignatura_1(),obtener_asignatura_2(),obtener_titulo_tercer_nivel(),obtener_titulo_cuarto_nivel());
        return cadena;
    }
}
