package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C03_DikdortgenAlaniHesaplama {
    public static void main(String[] args) {


        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        //        dikdortgenin alanini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Dikdörtgenin bir köşesinin uzunluğunu giriniz : ");
        int kose1 = scanner.nextInt();

        System.out.println("Dikdortgenin diger kosesinin uzunlugunu giriniz : ");
        int kose2 = scanner.nextInt();

        System.out.println("Dikdörtgenin alanı : " + (kose1*kose2));
    }
}
