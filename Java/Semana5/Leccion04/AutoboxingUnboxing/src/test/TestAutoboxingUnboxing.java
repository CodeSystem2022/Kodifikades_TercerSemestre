package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes o Wrapper
        /*
        Clases envolventes
        int = la clase envolvente es Integer
        long = La clase envolvente es Long
        float = La clase envolvente es Float
        double = La clase envolvente es Boolean
        boolean = La clase envolvente es Boolean
        byte = La clase envolvente es Byte
        char = La clase envolvente es Char
        short = La clase envolvente es Short
        */
        int enteroPrim = 10;  //Tipo Primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10;  //Tipo object con la clase integer
        System.out.println("entero = " + entero.doubleValue());  //Autoboxing
        
        int entero2 = entero;  //Unboxing 
        System.out.println("entero2 = " + entero2);
        
    }
}
