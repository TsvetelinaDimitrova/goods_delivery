package warenwirtschaftssystem;

public class Firmenkunde extends Kunde implements KuInterface {
    private double rabatt;

    public Firmenkunde(double rabatt, double umsatz, String vorname, 
            String nachname, String strasse, String plz, String ort) {
        super(umsatz, vorname, nachname, strasse, plz, ort);
        this.rabatt = rabatt;
    }

    public double getRabatt() {
        return rabatt;
    }

    public void setRabatt(double rabatt) {
        this.rabatt = rabatt;
    }
    
}
