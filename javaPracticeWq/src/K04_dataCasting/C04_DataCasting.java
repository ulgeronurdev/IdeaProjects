package K04_dataCasting;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {


        // kullanicidan iki tamsayi alin
        // sayilari birbirine bolup, islem sonucunu ondalikli olarak yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi1 = scanner.nextInt();

        System.out.println("Lütfen ikinci tamsayiyi giriniz");
        int sayi2 = scanner.nextInt();

        System.out.println("Bölme işleminin sonucu : " + (sayi1/sayi2));
        System.out.println("Bölme işleminin sonucu : " + (double)(sayi1/sayi2));

        System.out.println(  "sayilardan birini double'a cast edersek  : "  + (   sayi1/ (double) sayi2    )  );



        // NOT : bir tamsayiyi 10'a bolersek, birler basamagini silmis oluruz

        System.out.println(  243 / 10 ); // 24.3 ==> 24

        System.out.println(5234 / 10 ); // 523.4 ==> 523

        System.out.println( 523 / 10 ) ; // 52.3 ==> 52
    }
}
