package org.example;

public class Clase2 {

    String atributoDefault = "Valor del atributo default";

//    Clase2(){
//        System.out.println("Constructor default");
//    }

    void metodoDefault(){
        System.out.println("Método default");
    }

    public Clase2(){
        super();
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);

    }


}
