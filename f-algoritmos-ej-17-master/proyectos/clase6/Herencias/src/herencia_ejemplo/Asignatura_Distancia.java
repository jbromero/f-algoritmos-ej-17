package herencia_ejemplo;
/**
 * @author jbromero
 */
public class Asignatura_Distancia extends Asignatura{
    private int numero_creditos;

    public Asignatura_Distancia(String n, String t, int c, int n_c) {
        super(n, t, c);
        setNumero_Creditos(n_c);
    }
    
    public void setNumero_Creditos(int n){
        numero_creditos = n;
    }
    
    public int getNumero_Creditos(){
        return numero_creditos;
    }
    
    @Override
    public String toString(){
        return String.format("Asignatura Presencial:\n%s\nNumero creditos: %d",super.toString(),getNumero_Creditos());
    }
}
