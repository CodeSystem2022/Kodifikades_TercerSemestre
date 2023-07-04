package ModificadoresAcceso.Paquete1;

import ModificadoresAcceso.Paquete2.Clase4;

public class TestDefault {

    public static void main(String[] args) {
        ClaseHija2 claseh2 = new ClaseHija2();

        claseh2.atributoDefault = "Cambio desde la prueba";
        System.out.println("claseH2 atributo default = " + claseh2.atributoDefault);

        Clase4 clase4 = new Clase4("Publico");
        System.out.println(clase4.getAtributoPrivate());
        clase4.setAtributoPrivate("cambio");
        System.out.println("clase4 = " + clase4.getAtributoPrivate());
    }

}
