package test;
import Leccion07.domain.*;
import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;

public class TestConversionObjetos {
   public static void main(String[] args) {
       Empleado empleado;
       Empleado empleado2;
       empleado = new Escritor ("Juan", 5000, TipoEscritura.CLASICO);
       empleado2 = new Escritor ("Juan", 5000, TipoEscritura.CLASICO);
       //System.out.println("empleado= "+empleado);
       System.out.println(empleado.obtenerDetalles()); //Si queremos acceder a metodo Escritor
       //empleado.getTipoEscritura(); No se puede hacer
        if(empleado == empleado2) {
            System.out.println("Tienen la misma referencia en memoria.");
        } else {
            System.out.println("Tienen distinta referencia en memoria.");
        }

        if(empleado.equals(empleado2)){
            System.out.println("Los objetos son iguales.");
        } else {
            System.out.println("Los objetos no son iguales.");

        }
        //Downcasting
       //((Escritor)empleado).getTipoEscritura(); //Tenemos dos opciones: esta es una
       Escritor escritor = (Escritor)empleado; //Esta es la segunda opcion
       escritor.getTipoEscritura();
   
       //Upcasting
       Empleado empleado2 = escritor;
       System.out.println(empleado2.obtenerDetalles());
   
   }
}