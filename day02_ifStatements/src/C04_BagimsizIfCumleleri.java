import java.util.Scanner;

public class C04_BagimsizIfCumleleri {
    public static void main(String[] args) {
        /*
            Bagimsiz if cumleleri
            adindan da anlasilacagi gibi

            sadece kendi boolean sartina odaklanir ve
            kodun geriye kalani ile ilgilenmez

            bu sebeple
            bir kod blogunda, birden fazla bagimsiz if cumlesi varsa
            kacinin calisacagi onceden bilinemez
            girilen degerlere gore
            tum if body'leri devreye girebilecxegi gibi
            kismi calisma ve hatta hicbir body'nin calismamasi durumu da mumkundur


         */

        // kullanicidan 2 tam sayi alin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 2 tam sayi giriniz: ");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk" yazdirin

        if (sayi1 < sayi2) {
            System.out.println("birinci sayi daha kucuk");
        }
        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk" yazdirin
        if (sayi1 > 0) {
            System.out.println("birinci sayi sifirdan buyuk");
        }
        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk" yazdirin
        if (sayi2 > 50) {
            System.out.println("ikinci sayi 50'den buyuk");
        }
        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati" yazdirin
        if (sayi2 % 5 == 0) {
            System.out.println("ikinci sayi 5'in tam kati");
        }

    }
}
