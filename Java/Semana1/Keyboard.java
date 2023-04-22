//PROBABLY WE SHOULD CHANGE "DISPOSTIVOENTRADA" CLASS NAME
public class Keyboard extends DispositivoEntrada{
    private final int keyboardID;
    private static int keyboardsCount;
    public Keyboard(String inputType, String marca) {
        super(inputType, marca);
        this.keyboardID = ++Keyboard.keyboardsCount;
    }
    @Override
    public String toString(){
        return "Keyboard{" + "mouseID = " + keyboardID + "," + super.toString()+"}";
    }
}

