package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        //creamos un objeto de tipo Gerente
        Gerente gerente1 = new Gerente("José", 5000, "Sistemas");
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        
        //Creamos un nuevo objeto de tipo Gerente
        System.out.println("Gerente 2");
        Gerente gerente2 = new Gerente("Alberto", 5000, "Desarrollo");
        //System.out.println("gerente2 = " + gerente2.obtenerDetalles());
        
        Empleado empleado1 = new Empleado("Juan",10000);
        imprimir(empleado1);
        Gerente gerente3 = new Gerente("Jose", 5000, "Sistemas");
        imprimir(gerente3);
    }
    //public static void imprimir(Empleado empleado){
       // System.out.println("empleado= "+ empleado.obtenerDetalles());
   // }
    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("detalles = " + detalles);
    }
        
}