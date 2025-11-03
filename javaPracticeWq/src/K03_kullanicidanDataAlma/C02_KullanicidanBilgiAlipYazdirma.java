package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C02_KullanicidanBilgiAlipYazdirma {
    public static void main(String[] args) {


        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip,
        //        asagidaki formatta yazdirin.
        //		    Isminiz : John
        //		    Soyisminiz : Doe
        //		    Yasiniz : 44
        //		    Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lütfen yasinizi giriniz");
        double yas = scanner.nextDouble();

        System.out.println(
                "Isminiz : " + isim +
                "\nSoyisminiz : " + soyisim +
                "\nYasiniz : " + yas +
                "\nKaydiniz basariyla tamamlanmistir."
        );
    }
}
