package pckg_outsorcing_vecera;

public class GlavnoJelo {
    public double getPrice;
    private String nazivJela;
    private double cijena;

    public GlavnoJelo(String nazivJela, double cijena) {
        this.cijena = cijena;
        this.nazivJela = nazivJela;
    }

    @Override
    public String toString() {
        return "GlavnoJelo{" +
                "nazivJela='" + nazivJela + '\'' +
                ", cijena=" + cijena +
                '}';
    }
    
    public double getPrice() {
        return this.cijena;
    }
}
