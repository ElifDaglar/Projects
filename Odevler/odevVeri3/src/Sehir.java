public class Sehir {
    public int plakaNo;
    public long nufus;
    public String sehirAd;

    public Sehir(long nufus, String sehirAd) {
        this.nufus = nufus;
        this.sehirAd = sehirAd;
    }

    public int getPlakaNo() {
        return plakaNo;
    }

    public void setPlakaNo(int plakaNo) {
        this.plakaNo = plakaNo;
    }

    public String toString() {
        return "Şehir adı: " +sehirAd + "\nŞehir nüfusu: " + nufus + "\nplaka no: " + plakaNo;
    }


}
