package mundopc;

public class mundoPc {
    public static void main(String[] args) {
        //Creamos el 1er objeto
        Monitor monitorHP = new Monitor ("HP", 13); //importar clase
        Keyboard KeyboardHP = new Keyboard ("Bluethoot", "HP");
        Mouse MouseHP = new Mouse ("Bluethoot", "HP");
        Computadora computadoraHP = new Computadora("ComputadoraHP", monitorHP, KeyboardHP, MouseHP);
        
        //Creamos un 2do objeto
        Monitor monitorGamer = new Monitor ("Gamer", 32);
        Keyboard KeyboardGamer = new Keyboard ("Bluethoot", "Gamer");
        Mouse MouseGamer = new Mouse ("Bluethoot", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, KeyboardGamer, MouseGamer);

        //Creamos 3er objeto
        Monitor monitorLG = new Monitor ("LG", 24);
        Keyboard KeyboardLG = new Keyboard ("Cable", "LG");
        Mouse MouseLG = new Mouse ("Cable", "LG");
        Computadora computadoraLG = new Computadora("Computadora LG", monitorLG, KeyboardLG, MouseLG);

        //Creamos 4to objeto
        Monitor monitorAcer = new Monitor ("Acer", 28);
        Keyboard KeyboardAcer = new Keyboard ("Bluethoot", "Acer");
        Mouse MouseAcer = new Mouse ("Cable", "Acer");
        Computadora computadoraAcer = new Computadora("Computadora Acer", monitorAcer, KeyboardAcer, MouseAcer);

        //Creamos 5to objeto
        Monitor monitorRazor = new Monitor ("Razor", 32);
        Keyboard KeyboardRazor = new Keyboard ("Bluethoot", "Razor");
        Mouse MouseRazor = new Mouse ("Bluethoot", "Razor");
        Computadora computadoraRazor = new Computadora("Computadora Razor", monitorRazor, KeyboardRazor, MouseRazor);

        Orden orden1 = new Orden(); //Iniciamos el arreglo vacio
        Orden orden2 = new Orden(); //Una nueva lista para el orden2
        orden1.arreglarComputadora(computadoraHP); 
        orden1.arreglarComputadora(computadoraGamer);
        orden1.mostrarOrden();

        Computadora computadorasVarias = new Computadora("Computadoras de diferentes marcas", monitorGamer, KeyboardGamer, MouseHP);
        orden2.arreglarComputadora(computadorasVarias);

        orden1.mostrarOrden();
        orden2.mostrarOrden();
    }   
}