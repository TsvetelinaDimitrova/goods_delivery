package warenwirtschaftssystem;

abstract public class Kunde extends Person implements KuInterface{
    private double umsatz;

    public Kunde(double umsatz, String vorname, String nachname, 
            String strasse, String plz, String ort) {
        super(vorname, nachname, strasse, plz, ort);
        this.umsatz = umsatz;
    }
        
    
    @Override
    public double berecneRechnungsbetrag() {
        System.err.println("kunde berechnungsRechnungsbetrag");
        return 0.0;   
    }

    @Override
    public double berechneRabattstaffelung() {
        System.err.println("kunde berechnungsRabattstaffelung");
        return 0.0;   
    }

            
}
