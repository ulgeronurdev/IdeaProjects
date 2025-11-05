package K11_stringManipulations.D03_startswith_endsWith_indexOf;

import java.util.Scanner;

public class C03_emailKontrol {
    public static void main(String[] args) {
        //SORU : kullanicidan bir mail alin
        //          - mail @ icermiyorsa "gecersiz mail"
        //          - mail @gmail.com icermiyorsa, "mail gmail olmali"
        //          - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"  yazdirin.


        /*
            Eger tum kontrolleri yapmasini ve hatalari yazdirmasini istersek BAGIMSIZ IF cumleleri
            Eger buldugu ilk hatayi yazdirsin, ilk hata duzeltildikten sonra
            diger sartlari kontrol etsin diyorsaniz If Else Statement kullanmalisiniz
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen mailinizi giriniz");
        String email = scanner.nextLine();

        if (!email.contains("@")) {
            System.out.println("Geçersiz email");
        } else if (!email.contains("@gmail.com")) {
            System.out.println("Mail gmail olmalı");
        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("Mailde yazım hatası var");
        } else {
            System.out.println("Doğrusunuz");
        }
    }
}
