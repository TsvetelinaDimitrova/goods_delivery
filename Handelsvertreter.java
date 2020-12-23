package warenwirtschaftssystem;

public class Handelsvertreter extends Mitarbeiter implements MaInterface {
    private double provisionssatz;

    public Handelsvertreter(double provisionssatz, String vorname, 
            String nachname, String strasse, String plz, String ort) {
        super(vorname, nachname, strasse, plz, ort);
        this.provisionssatz = provisionssatz;
    }

    public double getProvisionssatz() {
        return provisionssatz;
    }

    public void setProvisionssatz(double provisionssatz) {
        this.provisionssatz = provisionssatz;
    }

    @Override
    public String toString() {
        return "Handelsvertreter{" + "provisionssatz=" + provisionssatz + '}';
    }

    /**Obwohl das Interface hier implementiert wurde, mussten die abstrakte 
    Methoden nicht implementiert wurden, da diese bereits in der Klasse 
    Mitarbeiter implementiert wurden und dadurch auf Grund der Vererbung 
    diese Klasse die Methoden schon kennt.
    */
       
    
}
