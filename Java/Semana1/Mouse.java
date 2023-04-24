//PROBABLY WE SHOULD CHANGE "DISPOSTIVOENTRADA" CLASS NAME
public class Mouse extends DispositivoEntrada {
    private final int mouseID;
    private static int mousesCount;

    public Mouse(String inputType, String marca) {
        super(inputType, marca);
        this.mouseID =  ++Mouse.mousesCount;
    }
    @Override
    public String toString(){
        return "Mouse{" + "mouseID = " + mouseID + "," + super.toString()+"}";
    }
}
