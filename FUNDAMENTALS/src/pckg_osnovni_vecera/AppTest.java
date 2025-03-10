package pckg_osnovni_vecera;

import pckg_outsorcing_vecera.Desert;
import pckg_outsorcing_vecera.GlavnoJelo;

public class AppTest {
    public static void main(String[] args) {
        Predjelo predjelo = new Predjelo("Juha od gljiva", 4.5);
        GlavnoJelo glavnoJelo = new GlavnoJelo("Teleći but", 10.98);
        Desert desert = new Desert("Bečka torta",5);
        Vecera vecera = new Vecera(predjelo, glavnoJelo, desert);
        double cijena = vecera.finalPrice();
        System.out.println("Za platiti: " + cijena);

    }
}
