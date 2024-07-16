public class Ogrenciler {
    private String ad;
    private String bolum;
    private int girisYili;
    private String ogrNo;
    private double gano;
    private int bolumKodu;


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getGirisYili() {
        return girisYili;
    }

    public void setGirisYili(int girisYili) {
        this.girisYili = girisYili;
    }

    public String getOgrNo() {
        return ogrNo;
    }

    public void setOgrNo(String ogrNo) {
        this.ogrNo = ogrNo;
    }

    public double getGano() {
        return gano;
    }

    public void setGano(double gano) {
        this.gano = gano;
    }

    public int getBolumKodu() {
        return bolumKodu;
    }

    public void setBolumKodu(int bolumKodu) {
        this.bolumKodu = bolumKodu;
    }

    public Ogrenciler(String ad, String bolum, int girisYili) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
    }

    public Ogrenciler(String ad, String bolum, int girisYili, String ogrNo, double gano) {
        this.ad = ad;
        this.bolum = bolum;
        this.girisYili = girisYili;
        this.ogrNo = ogrNo;
        this.gano = gano;
    }

    public Ogrenciler(String ad, String bolum, String ogrNo, double gano) {
        this.ad = ad;
        this.bolum = bolum;
        this.ogrNo = ogrNo;
        this.gano = gano;
    }

    public Ogrenciler(String ad, String bolum, int girisYili, String ogrNo, double gano, int bolumKodu) {
        this(ad, bolum, 0, null, 0.0);
    }

    public Ogrenciler() {
    }

    public Ogrenciler(double gano) {
        if (gano < 0 || gano > 4) {
            this.gano = gano;
            throw new IllegalArgumentException("gano 0-4 arasında olmalıdır!");
        }
    }

    public String ogrNoHesapla(String girisYili) {
        int bolumKodu = 104;
        String girisSirasi = "001";
        String studentNum = girisYili + bolumKodu + girisSirasi;
        return studentNum;
    }

    public String toString() {
        return String.format("%s %s %d %s %.2f", ad, bolum, girisYili, ogrNo, gano);
    }

    public void harcHesapla(int dersSayisi) {
       double dersUcreti = 160;
        double harcUcreti = 0;
        harcUcreti = (dersUcreti * dersSayisi);
        System.out.println("3.öğrencinin ödeyeceği harç: " + harcUcreti);


    }

    public void harcHesapla(int dersSayisi, double uzatilanYil) {
        double dersUcreti = 80;
        double harcUcreti = 0;
        harcUcreti = dersSayisi * uzatilanYil * dersUcreti;
        System.out.println("4.öğrencinin ödeyeceği harç: " + harcUcreti);
    }


}
