package K11_stringManipulations.D02_substring_contains;

public class C03_concat {
    public static void main(String[] args) {


        String str1 = "java";
        String str2 = "candir";
        String s3 = " ";
        int sayi1 = 3;
        int sayi2 = 4;

        // sadece variable'lari kullanarak "java candir 34" yazdirin

        System.out.println(str1 + s3 + str2 + s3 + sayi1+sayi2);

        System.out.println(str1.concat(s3).concat(str2).concat(s3).concat(sayi1+ "").concat(sayi2+""));

        // sadece variable'lari kullanarak "34 candir" yazdirin

        System.out.println( "" + sayi1 + sayi2 + s3 + str2);
    }
}
