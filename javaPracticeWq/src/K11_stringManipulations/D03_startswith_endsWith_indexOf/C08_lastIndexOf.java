package K11_stringManipulations.D03_startswith_endsWith_indexOf;

import java.util.Scanner;

public class C08_lastIndexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve cumlede aratilacak bir metin isteyin
        // girilen cumle ve metin'e gore asagidaki 3 sonucdan uygun olani yazdirin
        // 1- cumle aranan metni icermiyor
        // 2- cumle aranan metni sadece 1 adet iceriyor
        // 3- cumle aranan metni 1'den fazla iceriyor

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cumle giriniz : ");
        String cumle = scanner.nextLine();

        System.out.println("Lütfen cümlede aratılacak bir metin giriniz");
        String metin = scanner.nextLine();

        int ilkKullanimIndexi = cumle.indexOf(metin);
        int sonKullanimIndexi = cumle.lastIndexOf(metin);

        if (ilkKullanimIndexi == -1) {
            System.out.println("cümle aranan metni içermiyor");

        } else if (ilkKullanimIndexi==sonKullanimIndexi) {
            System.out.println("cümle aranan metni sadece 1 kez içeriyor");
        } else {
            System.out.println("cümle aranan metni 1 den fazla kez içeriyor");
        }
    }
}
