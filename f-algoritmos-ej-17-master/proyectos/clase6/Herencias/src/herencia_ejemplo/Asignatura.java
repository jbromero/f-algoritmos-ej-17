package herencia_ejemplo;
/**
 * @author jbromero
 */
public class Asignatura {
    private String nombre;
    //troncal o comun
    private String tipo;
    private int costo;
    
    public Asignatura(String n, String t, int c){
        setNombre(n);
        setTipo(t);
        setCosto(c);
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setTipo(String n){
        tipo = n;
    }
    
    public void setCosto(int n){
        costo = n;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public int getCosto(){
        return costo;
    }
    
    @Override
    public String toString(){
        return String.format("%s\n%s\n$%d",getNombre(),getTipo(),getCosto());
    }
}
