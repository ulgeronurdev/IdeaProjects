package K03_kullanicidanDataAlma;

import java.util.Scanner;

public class C06_Swap {
    public static void main(String[] args) {


        // Soru 7 (Interview)- Kullanicidan iki sayi alip
        //                     ikisinin degerlerini degistirin(swap).


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("Lütfen ikinci sayiyi giriniz");
        int sayi2 = scanner.nextInt();

        int temp = 0;
        temp = sayi2;
        sayi2 = sayi1;
        sayi1 = temp;

        System.out.println("sayi1'in yeni degeri" + sayi1);
        System.out.println("sayi2'nin yeni degeri" + sayi2);
    }
}
