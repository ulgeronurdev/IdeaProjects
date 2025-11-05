package K11_stringManipulations.D03_startswith_endsWith_indexOf;

import java.util.Scanner;

public class C05_IkinciKullanimIndexiniBulma {
    public static void main(String[] args) {
        // Kullanicidan bir metin isteyin
        // girilen metin'de 2. a'nin index'ini yazdirin
        // eger 2. a yoksa metin 2 a icermeli yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scanner.nextLine();

        int aHarfininIlkKullanimIndexi = metin.indexOf('a');

        int aHarfininIkinciKullanimIndexi = metin.indexOf('a', aHarfininIlkKullanimIndexi+1);

        if (aHarfininIkinciKullanimIndexi == -1) {
            System.out.println("Metin en az 2 adet a harfi içermeli");
        } else {
            System.out.println("İkinci a harfinin indeksi : " + aHarfininIkinciKullanimIndexi);
        }
    }
}
