public class Link {
    public Sehir sehir;
    public Link next;
    public Link previous;

    public Link(Sehir sehir) {
        this.sehir = sehir;

    }

    public void displayLink() {
        System.out.println(sehir.sehirAd + "Plaka No: " + sehir.plakaNo + " nufus: " + sehir.nufus);
    }
}