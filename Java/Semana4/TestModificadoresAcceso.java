package org.example;

public class TestModificadoresAcceso {

    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase 1 = " + clase1.atributoPublic);
        clase1.metodoPublic();
        Clase3 claseHija = new Clase3();
    }

}
