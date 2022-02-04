package Exercise2;

public class Bog {
    private int ISBNNumber;
    private String titel;
    private int udgivelsesår;

    public Bog(int ISBNNumber, String titel, int udgivelsesår) {
        this.ISBNNumber = ISBNNumber;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public int getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(int ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }
}
