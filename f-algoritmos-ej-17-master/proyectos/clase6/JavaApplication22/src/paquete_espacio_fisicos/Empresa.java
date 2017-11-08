package paquete_espacio_fisicos;
import java.util.Arrays;
import paquete_empleados.Empleado;
import paquete_localidades.*;
/**
 * @author jbromero
 */
public class Empresa {
    private String nombre;
    private String direccion;
    private Empleado[] lista_empleados;
    private Provincia provincia_residencia;
    private Edificio lista_edificios;

    public Empresa(String nom, String dir, Empleado[] lis_emp, Provincia pro_res, Edificio lis_edi) {
        nombre = nom;
        direccion = dir;
        lista_empleados = lis_emp;
        provincia_residencia = pro_res;
        lista_edificios = lis_edi;
    }
    
    public void establecer_nombre(String nom){
        nombre = nom;
    }
    
    public String obtener_nombre(){
        return nombre;
    }
    
    public void estblacer_direccion(String dir){
        direccion = dir;
    }
    
    public String obtener_direccion(){
        return direccion;
    }
    
    public void estblacer_lista_empleados(Empleado[] lis_emp) {
        lista_empleados = lis_emp;
    }
    
    public Empleado[] obtener_lista_empleados() {
        return lista_empleados;
    }
    
    public void estblacer_provincia_residencia(Provincia pro_res) {
        provincia_residencia = pro_res;
    }
    
    public Provincia obtener_provincia_residencia() {
        return provincia_residencia;
    }
    
    public void estblacer_lista_edificios(Edificio lis_edi) {
        lista_edificios = lis_edi;
    }
    
    public Edificio obtener_lista_edificios() {
        return lista_edificios;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Empresa: %s\nDireccion: %s - %s\nSus empleados son:\n%s\nSus edificios son:\n%s",obtener_nombre(),obtener_direccion(),obtener_provincia_residencia(),Arrays.toString(obtener_lista_empleados()),obtener_lista_edificios());
        return cadena;
    }
    
    /*public void promedio_edad_empleados(){
        
    }
    
    public int obtener_promedio_edad_empleados(){
        return;
    }*/
}
