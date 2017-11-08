package herencias;
import herencia_ejemplo.*;
/**
 * @author reroes
 */
public class Estudiante extends Persona{
    Asignatura asignatura[];

    public Estudiante(String n, String a, int e, Asignatura[] a1) {
        super(n, a, e);
        setAsignatura(a1);
    }
       
    @Override
    public void setEdad(int e){
        if (e<18) {
            edad = 18;
        }else{
            edad = e;
        }
    }
    
    public void setAsignatura(Asignatura[] n){
        asignatura = n;
    }
    
    public Asignatura[] getAsignatura(){
        return asignatura;
    }
    
    public int obtener_valor_matricula(){
        int valor_matricula=0;
        for (Asignatura asignaturas : asignatura) {
            valor_matricula+=asignaturas.getCosto();
        }
        return valor_matricula;
    }
    
    @Override
    public String toString(){
        String cadena = "";
        for (Asignatura asignaturas : asignatura) {
            cadena+=asignaturas.toString();
        }
        return String.format("%s\nCosto Matricula: %d\nListado de Asignaturas:\n%s", super.toString(),obtener_valor_matricula(),cadena);
    }
    
    
    // @Override
    // public String toString(){
    
    //    return String.format("%s - %f", getApellido(), getMatricula());
    // }
}
