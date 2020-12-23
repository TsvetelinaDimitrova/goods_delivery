package warenwirtschaftssystem;

public class Person {
    //Deklarieren der Eigenschaften
    private String vorname, nachname, strasse, plz, ort;
    
    //Konstruktor

    public Person(String vorname, String nachname, String strasse, String plz, String ort) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.strasse = strasse;
        this.plz = plz;
        this.ort = ort;
    }
    // Konstruktor für Aufruf durch Lieferant
    public Person(String strasse, String plz, String ort) {
        this.strasse = strasse;
        this.plz = plz;
        this.ort = ort;
    }
    
    //Getter/Setter
    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
    
    //Üersreiben toString

    @Override
    public String toString() {
        return "Person{" + "vorname=" + vorname + ", nachname=" + nachname + 
                ", strasse=" + strasse + ", plz=" + plz + ", ort=" + ort + '}';
    }
    
}
