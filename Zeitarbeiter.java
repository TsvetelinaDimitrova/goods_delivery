package warenwirtschaftssystem;

public class Zeitarbeiter extends Mitarbeiter implements MaInterface {
    private double stundenlohn;

    public Zeitarbeiter(double stundenlohn, String vorname, 
            String nachname, String strasse, String plz, String ort) {
        super(vorname, nachname, strasse, plz, ort);
        this.stundenlohn = stundenlohn;
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    @Override
    public String toString() {
        return "Zeitarbeiter{" + "stundenlohn=" + stundenlohn + '}';
    }
    
    
    
}
