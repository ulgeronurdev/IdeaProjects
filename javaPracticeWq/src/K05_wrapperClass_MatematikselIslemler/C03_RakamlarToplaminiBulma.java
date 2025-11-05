package K05_wrapperClass_MatematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplaminiBulma {
    public static void main(String[] args) {


        // Kullanicidan 3 basamakli pozitif bir tamsayi isteyin
        // sayinin rakamlar toplamini bulun
        // ornek input = 245  ise output = 11

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı pozitif bir tamsayi girin");
        int sayi = scanner.nextInt();
        int birlerBasamagindakiRakam = 0;
        int rakamlarToplami = 0;

        birlerBasamagindakiRakam = sayi %10;

        rakamlarToplami = rakamlarToplami + birlerBasamagindakiRakam;
        sayi = sayi /10;

        birlerBasamagindakiRakam = sayi %10;

        rakamlarToplami = rakamlarToplami + birlerBasamagindakiRakam;

        sayi = sayi /10;
        rakamlarToplami = rakamlarToplami + birlerBasamagindakiRakam;

        System.out.println("Girilen sayinin toplami " + rakamlarToplami);
    }
}
