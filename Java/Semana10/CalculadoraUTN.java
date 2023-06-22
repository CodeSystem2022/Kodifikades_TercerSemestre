import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true){ //Ciclo infinito

            System.out.println("******* Aplicacion Calculadora *******");
            mostrarMenu();
            
            try{
                var operacion = Integer.parseInt(entrada.nextLine());
                if(operacion >= 1 && operacion <= 4) {

                    ejecutarOperacion(operacion, entrada);
                }//Fin del if

                else if (operacion == 5){
                    System.out.println("Hasta pronto...");
                    break;//Rompe el ciclo y sale
                }else{
                    System.out.println("Opción erronea: "+operacion);
                }
                //Imprimimos un salto de linea antes de repetir el menu
                System.out.println();
            }catch (Exception e){//Fin try,comienza el catch
                System.out.println("Ocurrio un error: "+e.getMessage());
                System.out.println();
            }//Fin catch
        }//Fin while
    }//Fin main

    public static void mostrarMenu(){
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
    }

    public static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.println("Digite el valor del operando1: ");
        var operando1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el valor del operando2: ");
        var operando2 = Integer.parseInt(entrada.nextLine());
        int resultado;
        switch(operacion){
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
            }
            case 3 -> {
                resultado = operando1 * operando2;
            }
            case 4 -> {
                resultado = operando1 / operando2;
            }
            case 5 -> {
                break;
            }
        }
    }
}