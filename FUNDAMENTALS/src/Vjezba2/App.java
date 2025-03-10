package Vjezba2;
import java.util.Scanner;
/**
 * Ilustracija inicijalizacije cjelobrojnog niza
 * @author ante
 * @version 1.1
 */

public class App {

    public static void main(String[] args) {

        int[] brojevi = new int[10];
        Scanner sc = new Scanner(System.in);
        boolean flag;

        for (int i = 0; i < brojevi.length; i++) {
            System.out.println(brojevi[i]);
        }

        System.out.println("*******************************************");

        for (int i = 0; i < brojevi.length; i++) {

            flag = true;

            while (flag) {

                System.out.println("Unesite jedan cijeli broj za "+ i + " element niza: ");
                if (sc.hasNextInt()) {

                    brojevi[i] = sc.nextInt();
                    System.out.println("Unijeli ste --> " + brojevi[i]);
                    flag = false;

                } else {

                    System.out.println("Pogrešan unos. Probajte ponovno!");
                    System.out.println("********************************************");
                    flag = true;

                }

                sc.nextLine(); // Clear Scanner

            }

        }

        sc.close();
        // ova linija čisti scanner

        for (int i = 0; i < brojevi.length; i++) {
            System.out.println("brojevi [" + i + "]: " +  brojevi[i]);
        }

    }

}
/*
1 - ovaj program trazi unos intigera na svako mjesto u listi ako nije intiger trazi ponovni unos
4 - kada unesemo 1 2 3 4 5 6 7 8 0 10 programi pravino izbaci listu i njihove pozicije
5 - kada unesemo *  program nas obavjesta da smo unijeli krivi znak, treba intiger a unijeli smo string
 */