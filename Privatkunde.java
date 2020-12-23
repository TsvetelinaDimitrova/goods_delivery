package warenwirtschaftssystem;

public class Privatkunde extends Kunde implements KuInterface {
    
    public Privatkunde(double umsatz, String vorname, String nachname, 
            String strasse, String plz, String ort){
        super(umsatz, vorname, nachname, strasse, plz, ort);
    }

    @Override
    public String toString() {
        return "Privatkunde{" + '}';
    }
     
}
