package K11_stringManipulations.D01_charAt_length_equals;

import java.util.Scanner;

public class C03_length {
    public static void main(String[] args) {


        // Kullanicidan bir metin isteyin
        // ve girilen metinde kac karakter kullanildigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String str = scanner.nextLine();

        System.out.println(str.length());

        // girilen metnin son karakterini yazdırın

        System.out.println(str.charAt(str.length() - 1));

         /*

            1- Karakter sayisi = son harfin index'i + 1
               son harfin index'i = length -1

            2- charAt(index) kullanirken length() degerini veya daha buyuk bir sayiyi kullanirsak
               Java StringIndexOutOfBoundsException verir

            3- bastan 5. karakter icin  str.charAt(5-1)
               sondan 5. karakter icin str.charAt( str.length() - 5 ) kullanilir

         */

        // bastan 3.karakteri yazdirin

        System.out.println(str.charAt(2));

        // sondan 3.karakteri yazdirin

        System.out.println( str.charAt(  str.length() - 3) );  // d

        // metindeki bastan 2. ve sondan 3. karakterleri yan yana yazdirin


        System.out.println( ""+str.charAt(1) + str.charAt(str.length()-3));
    }
}
