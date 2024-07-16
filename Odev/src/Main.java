public class Main {
    public static void main(String[] args) {
        System.out.println("Öğrencilerin Bilgileri");
        Ogrenci ogrenci = new Ogrenci();
        Ogrenci[] ogrenciler = {new Ogrenci(null, null, ogrenci.ogrenciNoOlustur("1973"), 0.0),
                new Ogrenci("Gökhan", "Bilgisayar Müh", ogrenci.ogrenciNoOlustur("1985"), 0.0),
                new Ogrenci("Ayşe", "Makine Müh", ogrenci.ogrenciNoOlustur("1985"), 0.0),
                new Ogrenci("Elif", "Elektrik Elektronik Müh", ogrenci.ogrenciNoOlustur("2020"), 1.98)};

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println("OGR-" + (i+1) + " " + ogrenciler[i]);
        }

        ogrenci.harcHesapla(3);
        ogrenci.harcHesapla(6, 2);


    }
}
