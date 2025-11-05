package K05_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C02_Modulus {
    public static void main(String[] args) {


        System.out.println(25/10);

        System.out.println(15/4);

        System.out.println(35%10);

        System.out.println(15%4);

        //girilens ayinin çift olup olmadıgını yazdırın
        // sayi 2'ye bolunuyorsa yani kalan 0 ise yani %2 ==> 0 ise sayi cifttir

        int sayi = 45;

        System.out.println(sayi % 2);

        // girilen sayinin 5'e bolunup bolunmedigini yazdirin

        System.out.println( sayi % 5 ); // sonucu 0 ise yani kalan 0 ise 5'e bolunur

        // girilen sayinin 3'un tam kati olup olmadigini yazdirin

        System.out.println( sayi % 3 ); // sonucu 0 ise yani kalan 0 ise 3'un tam katidir

        // kullanicidan bir tamsayi isteyin
        // girilen sayinin birler basamagini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen pozitif bir tamsayi giriniz");

        int girilenSayi = scanner.nextInt();

        System.out.println(girilenSayi %10);

        System.out.println(259/10);

    }
}
