
package test;

import Java.Semana7.accesodatos.IAccessoDatos;
import Java.Semana7.accesodatos.ImplementacionMySQL;
import accesodatos.ImplementacionOracle;


public class TestInterfaces {
  
    public static void main(String[] args) {
        IAccessoDatos datos = new ImplementacionMySQL(); // Creamos variables de tipo interface
   // en paradigma orientado a objetos uno de los objetivos es hacer código lo más genérico posible                                                     
   //datos.listar();
   //imprimir(datos);

        // polimorfismo: una misma variable apunta a diferentes implementaciones
        
        datos = new ImplementacionOracle();
        // datos.listar();
        imprimir(datos);

    }

    // Hay que tener en cuenta si agregamos otro método, debe ser estático
    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}
