package warenwirtschaftssystem;

public class Mitarbeiter extends Person implements MaInterface {
    private double tariflohn;

    public Mitarbeiter(double tariflohn, String vorname, String nachname, 
            String strasse, String plz, String ort) {
        super(vorname, nachname, strasse, plz, ort);
        this.tariflohn = tariflohn;
    }
    
    public Mitarbeiter(String vorname, String nachname, 
            String strasse, String plz, String ort) {
        super(vorname, nachname, strasse, plz, ort);
    }
    
    @Override
    public double berechneVergütung() {
        System.err.println("Mitarbeiter berechne Verguetung");
        return 0.0;
    }

    @Override
    public double berechneArbeitszeit() {
        System.err.println("Mitarbeiter berechne Arbeitszeit");
        return 0.0;
    }

    @Override
    public String toString() {
        return "Mitarbeiter{" + "tariflohn=" + tariflohn + '}';
    }
    
    
    
}
