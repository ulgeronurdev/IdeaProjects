package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C01_ScannerClassKullanimi {
    public static void main(String[] args) {


        // Soru 2- Kullanicidan bir double, bir de int sayi alip
        //         bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ondalıklı bir sayi giriniz");

        double ondalikliSayi = scanner.nextDouble();

        System.out.println("Lütfen tamsayi giriniz");

        int tamSayi = scanner.nextInt();

        System.out.println("Sayilarin toplami : " + (tamSayi + ondalikliSayi));
        System.out.println("Sayilarin carpimi : " + (tamSayi * ondalikliSayi));
    }
}
