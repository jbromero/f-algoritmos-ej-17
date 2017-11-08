package herencia_ejemplo;
/**
 * @author jbromero
 */
public class Asignatura_Presencial extends Asignatura{
    private int numero_horas;

    public Asignatura_Presencial(String n, String t, int c,int n_h) {
        super(n, t, c);
        setNumero_Horas(n_h);
    }
    
    public void setNumero_Horas(int n){
        numero_horas = n;
    }
    
    public int getNumero_Horas(){
        return numero_horas;
    }
    
    @Override
    public String toString(){
        return String.format("Asignatura Presencial:\n%s\nNumero horas: %d",super.toString(),getNumero_Horas());
    }
}
