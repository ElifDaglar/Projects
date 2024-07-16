import java.security.SecureRandom;

public class Musteri {


    private int musteriNo;
    private String ad;
    private String soyad;
    private String eposta;
    private String telefon;
    private static int sonrakiMusteriNo = 0;


    public Musteri(String ad, String soyad, String eposta, String telefon) {
        this.ad = ad;
        this.soyad = soyad;
        this.eposta = eposta;
        this.telefon = telefon;
        SecureRandom random = new SecureRandom();
        this.musteriNo = random.nextInt(100) + 1 + sonrakiMusteriNo; //müşteri no ları aynı olmasın diye.
        sonrakiMusteriNo++;


    }

    public int getMusteriNo() {
        return musteriNo;


    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String toString() {
        return "Müşteri adı: " + ad + " Müşteri soyadı: " + soyad + " Müşteri e-posta: " + eposta + " Müşteri telefon no: " + telefon + " Müşteri No: " + musteriNo;
    }

    public boolean eslesmeKontrol(String anahtarKelime) {
        return ad.equals(anahtarKelime) || soyad.equals(anahtarKelime) || eposta.equals(anahtarKelime) || telefon.equals(anahtarKelime);

        // }
    }
}
