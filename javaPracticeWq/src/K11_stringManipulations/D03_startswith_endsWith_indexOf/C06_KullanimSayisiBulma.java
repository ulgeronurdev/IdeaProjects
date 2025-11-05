package K11_stringManipulations.D03_startswith_endsWith_indexOf;

import java.util.Scanner;

public class C06_KullanimSayisiBulma {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve cumlede aratilacak bir metin isteyin
        // girilen cumle ve metin'e gore asagidaki 3 sonucdan uygun olani yazdirin
        // 1- cumle aranan metni icermiyor
        // 2- cumle aranan metni sadece 1 adet iceriyor
        // 3- cumle aranan metni 1'den fazla iceriyor

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("Cümlede aratılacak bir metin giriniz");
        String metin = scanner.nextLine();

        int metninIlkIndeksi = cumle.indexOf(metin);

        int metninIkinciKullanimiVarMi = cumle.indexOf(metin, metninIlkIndeksi+1);

        if (metninIlkIndeksi==-1) {
            System.out.println("Cümle aranan metni içermiyor");
        } else if (metninIkinciKullanimiVarMi == -1) {
            System.out.println("Cümle aranan metni 1 kez içeriyor");
        } else {
            System.out.println("CÜmle aranan metni 1'den fazla içeriyor");
        }
    }
}
