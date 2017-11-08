package herencias;
/**
 * @author jbromero
 */
public class Profesor extends Persona{
    private double sueldo;
    
    public Profesor (){
        super("Carlos", "Pinto",25);
        sueldo = 100.1;
    }

    public Profesor(String n, String a, int e, double s) {
        super(n, a, e);
        setSueldo(s);
    }
    
    public Profesor(double s) {
        super("Rene", "Elizalde",34);
        setSueldo(s);
    }
    
    @Override
    public void setEdad(int e){
        if (e<30) {
            edad = 30;
        } else {
            edad = e;
        }
    }
    
    public void setSueldo(double n){
        sueldo = n;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    @Override
    public String toString(){
        return String.format("%s - %f", super.toString(), getSueldo());
    }
}
