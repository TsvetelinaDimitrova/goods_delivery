package warenwirtschaftssystem;

public class Lieferant extends Person{
    private String ansprechpartner, firmenname;

    public Lieferant(String ansprechpartner, String firmenname, String strasse, 
            String plz, String ort) {
        super(strasse, plz, ort);
        this.ansprechpartner = ansprechpartner;
        this.firmenname = firmenname;
    }

    public String getAnsprechpartner() {
        return ansprechpartner;
    }

    public void setAnsprechpartner(String ansprechpartner) {
        this.ansprechpartner = ansprechpartner;
    }

    public String getFirmenname() {
        return firmenname;
    }

    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
    }

    @Override
    public String toString() {
        return "Lieferant{" + "ansprechpartner=" + ansprechpartner + 
                ", firmenname=" + firmenname + '}';
    }
    
    
}
