package K05_wrapperClass_MatematikselIslemler;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        String str = "Java candir";
        int sayi =34;

        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(2));

        // Java primitive data turlerinde bazi hazir method'lar kullanabilmemiz icin
        // WRAPPER CLASS'lari olusturmustur
        // boolean, char     , byte, short, int    , long, float, double
        // Boolean, Character, Byte, Short, Integer, Long, Float, Double

        int sayi1 = 5;
        Integer sayi2 = sayi1;

        Integer sayi3 = 3456;
        int sayi4 = sayi3;

        // primitive variable'lar ile ayni data turunun wrapper class'indaki variable'lar arasinda
        // gecis mumkundur
        // Ammma farkli wrapper class'lar arasinda gecis mumkun degildir
        // Ayni sekilde Wrapper class'dan olusturulan bir variable'a baska isimdeki primitive data turundeki
        // degeri de ATAYAMAYIZ

        int sayi5 = 25;
        short sayi6 = 45;
        byte sayi7 = 23;

        int sayi8 = sayi6;
        sayi6 = sayi7;

        Short sayi9 = 45;
        // Integer sayi10 = sayi9;  // Integer <== Short

        // Integer sayi11 = sayi6 ; // Integer <== short



        String fiyat1 = "23";
        String fiyat2 = "45";
        // String olarak verilen iki urunun fiyatini toplayin

        System.out.println( fiyat1 + fiyat2 ); // 2345

        // Icinde SADECE sayilar oldugundan emin oldugumuz String'leri
        // Wrapper class'lari kullanarak sayiya cevirebiliriz

        int fiy1 = Integer.parseInt(fiyat1);
        int fiy2 = Integer.parseInt(fiyat2);

        System.out.println("Fiyatların toplamı : " + (fiy1 + fiy2));


        fiyat1 = "23.45";
        fiyat2 = "34.43";

        double f1 = Double.parseDouble(fiyat1);
        double f2 = Double.parseDouble(fiyat2);

        System.out.println("Fiyatların toplamı : " + (f1+f2));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        //kullanıcıdan bir karakter alıp
        char harf = 's';

        //verilen karakterde büyük harf olup olmadıgını yazdırın

        System.out.println(Character.isUpperCase(harf));

        //verilen karakterde küçük harf olup olmadıgını yazdırın

        System.out.println(Character.isLowerCase(harf));

        //verilen karakterde sayı olup olmadıgını yazdırın
        System.out.println(Character.isDigit(harf));

        //verilen karakterin harf olup olmadıgını kontrol edin
        System.out.println(Character.isLetter(harf));

        // verilen karakterin alfabetik olup olmadıgını kontrol edin
        System.out.println(Character.isAlphabetic(harf));

        //verilen karakteri büyük harf olarak yazdırın

        System.out.println(Character.toUpperCase(harf));


    }
}
