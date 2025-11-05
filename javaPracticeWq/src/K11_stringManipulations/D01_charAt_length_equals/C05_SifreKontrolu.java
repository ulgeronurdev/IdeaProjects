package K11_stringManipulations.D01_charAt_length_equals;

import java.util.Scanner;

public class C05_SifreKontrolu {
    public static void main(String[] args) {


        // Kullanicidan sifre olusturmak uzere sifre isteyin.
        // Sifreyi iki kere isteyin
        // eger metin ayni oldugu halde yazim farkliligi varsa
        // "Lutfen yazimi kontrol edin" yazdirin
        // Eger karakter farkliligi varsa
        // "Girilen sifreler farkli" yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String sifre = scanner.nextLine();

        System.out.println("Lütfen şifrenizi tekrar giriniz");
        String sifre2 = scanner.nextLine();

        if (sifre.equalsIgnoreCase(sifre2)) {
            System.out.println("Lütfen yazimi kontrol ediniz");
        }else {
            System.out.println("Girilen sifreler farkli");
        }
    }
}
