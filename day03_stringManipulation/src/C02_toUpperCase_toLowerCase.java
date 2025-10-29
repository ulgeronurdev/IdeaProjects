import java.util.Locale;

public class C02_toUpperCase_toLowerCase {
    public static void main(String[] args) {

        String str = "Ali geldi, saz caldi";

        System.out.println(str.toUpperCase());

        // Turkce de i İ   ve ı I
        // Eger ingilizce buyuk/kucuk harf degisimi,
        // kullandiginiz local dilin buyuk/kucuk harf degisiminden farkli ise

        // eger i'yi Turkce buyuk harfe yani İ ye cevirmek isterseniz

        System.out.println(str.toUpperCase(Locale.TRADITIONAL_CHINESE));

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

        str = str.toUpperCase();

        System.out.println("buyuk harfe kalici olarak ceviren str : " + str);

        // str'i kucuk harfe cevirin
        // not I -> i olmalıdır.

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));
    }
}
