public class TestArgumentosVariables{
  public static void main(String[] args) {
    printNumbers(3,4,5);
    printNumbers(1,2,8);
    variosParametros("Lucas",1,2,8);
  }
  public static void variosParametros(String nombre, int numbers) {
    System.out.println("Nombre: "+ nombre);
    printNumbers(numbers);
  }
  
  private static void printNumbers(int ...numbers) {
    for(int i = 0; i < numbers.length; i++){
      System.out.println("Elements: "+ numbers[i]);
    }
  }
}