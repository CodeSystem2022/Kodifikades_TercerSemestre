public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Keyboard Keyboard;
    private Mouse Mouse;
    private static int contadorComputadoras;



    //Constructor vacio
    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }


    //Contructor 2
    public Computadora(String nombre, Monitor monitor, Keyboard Keyboard, Mouse Mouse) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.Keyboard = Keyboard;
        this.Mouse = Mouse;
    }


    public int getIdComputadora() {
        return idComputadora;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Monitor getMonitor() {
        return monitor;
    }


    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }


    public Keyboard Keyboard() {
        return Keyboard;
    }


    public void setKeyboard(Keyboard Keyboard) {
        this.Keyboard = Keyboard;
    }


    public Mouse getMouse() {
        return Mouse;
    }


    public void setMouse(Mouse Mouse) {
        this.Mouse = Mouse;
    }


    @Override
    public String toString() {
        return "Computadora [idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor
                + ", Keyboard=" + Keyboard + ", Mouse=" + Mouse + "]";
    }

}
