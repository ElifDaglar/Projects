public class Main {
    public static void main(String[] args) {

        Ogrenciler ogrenciler = new Ogrenciler();
        Ogrenciler[] ogrenci = {new Ogrenciler(null, null, ogrenciler.ogrNoHesapla("1973"), 0.0),
                new Ogrenciler("gökhan", "bilgisayar müh", ogrenciler.ogrNoHesapla("1985"), 0.0),
                new Ogrenciler("ayşe", "makine müh", ogrenciler.ogrNoHesapla("1985"), 0.0),
                new Ogrenciler("elif", "elektrik elektronik müh", ogrenciler.ogrNoHesapla("2020"), 1.98)};
        for (int i = 0; i < ogrenci.length; i++) {
            System.out.println("OGR-" + (i+1) + " " + ogrenci[i]);

        }
        ogrenciler.harcHesapla(3);
        ogrenciler.harcHesapla(2,6);
    }
}