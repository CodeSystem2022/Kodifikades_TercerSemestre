package test;

import Leccion07.domain.*;
import domain.Empleado;
import domain.Gerente;

public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 10000);
        determinarTipo(empleado1); 
        empleado1 = new Gerente("José", 5000,"Sistemas"); 
    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente)empleado; //convertimos a un tipo Gerente
            System.out.println("gerente = " + gerente.getDepartamento()); 
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            //Gerente gerente = (Gerente)empleado; 
            //System.out.println("gerente = " + gerente.getDepartamento());
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }  
}