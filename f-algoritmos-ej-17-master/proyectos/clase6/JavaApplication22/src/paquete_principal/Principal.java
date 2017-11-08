package paquete_principal;
import paquete_empleados.Empleado;
import paquete_espacio_fisicos.*;
import paquete_localidades.*;
/**
 * @author jbromero
 */
public class Principal {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Continente c = new Continente("Madrid");
        Pais pa = new Pais("España",c);
        Provincia pr = new Provincia("Europa",pa);        
        
        Empleado e = new Empleado("Luis Velez",30,6,1000);
        Empleado e2 = new Empleado("Julio malla",20,1,1100);
        Empleado e3 = new Empleado("Monica Narvaez",25,5,1200);
        Empleado e4 = new Empleado("Ana Larenas",40,10,1400);
        
        Empleado[] lista_empleados = {e,e2,e3,e4};
        
        Edificio ed = new Edificio("Sucursal 1","Av. Universitaria","Piura/Perú/América",220000);
        Edificio ed2 = new Edificio("Sucursal 2","Av. Cenepa","Esmeraldas/Ecuador/América",120000);
        Edificio ed3 = new Edificio("Sucursal 3","Av. Rocafuerte","Bogotá/Colombia/América",120000);        
        
        Empresa em = new Empresa("Desarrollo de SW Asociados","Plaza de la Puerta del Sol",lista_empleados,pr,ed);
        System.out.println(em);
    }
}
