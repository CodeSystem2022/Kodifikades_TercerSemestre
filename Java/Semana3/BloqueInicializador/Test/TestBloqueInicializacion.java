package BloqueInicializador.Test;

import BloqueInicializador.Domain.Persona;

public class TestBloqueInicializacion {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        System.out.println("persona1 = " + persona1);
        Persona persona2 = new Persona();
        System.out.println("persona1 = " + persona2);
    } // El bloque estático se ejecuta una sola vez
 
}
