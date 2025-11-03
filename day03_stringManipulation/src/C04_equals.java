public class C04_equals {
    public static void main(String[] args) {


        // primitive data türlerinde karşılaştırma için == kullanılır

        int a = 5;
        int b = 7;
        int c = 2;

        System.out.println(a == b);
        System.out.println( b == a + c);

        // ama String'de metinlerin aynı oldugunu kontrol etmek için == kullanılması tavsiye edilmez.!

        String s1 = "Ali";
        String s2 = "Ali";
        String s3 = "A" + "li";
        String s4 = new String("Ali");
        String str = "A";
        String abc = "li";
        String s5 = str + abc;

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == "Ali");

        // == String'de kullanılırsa
        //hem metin degerine hem de referansa bakar (ilerde anlatılacak)
        // bu sebeple == , metinler aynı olsa da bazen true bazen false verebilir

        //Eger sadece metin olarak karsılastırmak isterseniz
        //== degil equals() kullanılmalıdır.

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals("Ali"));

        System.out.println("Ali".equals("ali"));
        System.out.println("Ali".equals("ALI"));
        System.out.println("Ali".equals("A l i"));
        System.out.println("Ali".equals("Ali "));
        System.out.println("Ali".equals(" Ali "));

        // Eger buyuk kucuk harf önemli olmasın
        // metin önemli olsun derseniz
        // Pazartesi, pazartesi, PAZARTESI, PaZaRtEsI, PAZARtesi

        System.out.println("Pazartesi".equalsIgnoreCase("PAZARTESI"));
        System.out.println("Pazartesi".equalsIgnoreCase("pazartesi")); // true
        System.out.println("Pazartesi".equalsIgnoreCase("PAZARtesi")); // true
        System.out.println("Pazartesi".equalsIgnoreCase("PaZaRtEsI")); // true
        System.out.println("Pazartesi".equalsIgnoreCase("PAZARTESE")); // false
        System.out.println("Pazartesi".equalsIgnoreCase("PAZARTESI ")); // false
    }
}
