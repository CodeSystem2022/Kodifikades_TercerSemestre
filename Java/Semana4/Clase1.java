package org.example;

public class Clase1 {

    public String atributoPublic = "Valor atributo public";
    protected String atributoProtected = "Valor atributo protected";

    public Clase1(){
        System.out.println("Constructor public");
    }

    protected Clase1(String atributoPublic){
        System.out.println("Constructor protected");
    }

    public void metodoPublic(){
        System.out.println("Método public");
    }

    protected void metodoProtected(){
        System.out.println("Método protected");
    }


}
