package K02_dataKullanimiVeVariables;

public class C01_VariableKullanimi {
    public static void main(String[] args) {


        int sayi =20;

        System.out.println("hesabim");

        System.out.println("sayi");

        System.out.println("benim adim Cemil, ne istersem yaparim...");

        // Java'da bir metin yazdirmak ile
        // bir variable'in degerini yazdirmak farkli seylerdir
        // bir metin yazdirmak istedigimizde "" kullaniriz
        // ve java "" icinde ne goruyorsa konsolda aynisini yazdirir
        // variable'in degerini yazdirmak istedigimizde SADECE variable ismini yazariz

        System.out.println(sayi);

        System.out.println("Sayi variableının degeri : " + sayi);

        int yas = 40;

        System.out.println("yas variableının 27.satirdaki degeri : " + yas);

        yas = yas +5;

        System.out.println("yas variableının 31.satirdaki degeri : " + yas);

        yas = 2 * yas + 1;

        System.out.println("yas variableının 35.satirdaki degeri : " + yas);



    }
}
