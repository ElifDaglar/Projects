import java.util.*;

public class MusteriYoneticisi {
    private int maksimumBoyut;
    private Musteri[] musteriler;
    private int musteriSayisi;

    public MusteriYoneticisi(int maksimumBoyut) {
        musteriler = new Musteri[maksimumBoyut];
        this.maksimumBoyut = maksimumBoyut;
    }

    public void musteriEkle(Musteri musteri) {
        if (musteriSayisi < maksimumBoyut) {
            musteriler[musteriSayisi] = musteri;
            musteriSayisi += 1;
            System.out.println(musteri);
        } else {
            throw new ArrayIndexOutOfBoundsException("Maksimum müşteri sayısına ulaşıldı. Yeni müşteri ekleyemezsiniz!");
        }
    }

    public void musterileriSiralamaListele() {
        Musteri[] geciciMusteriler = Arrays.copyOf(musteriler, musteriSayisi);
        //Arrays.copy of kullanılmazsa aynı diziyi referans alıyor ve diziyi değiştiriyor bu yüzden müşterisırala doğru çalışmıyor.
        //her bir müşteriyi alacak yazdıracak ama müşteri nolarına göre sıralayacak
        //bubble sort mantığı kullanıldı
        for (int i = 0; i < musteriSayisi - 1; i++) {
            for (int j = 0; j < musteriSayisi - 1 - i; j++) {
                if (geciciMusteriler[j].getMusteriNo() > geciciMusteriler[j + 1].getMusteriNo()) {
                    Musteri gecici = geciciMusteriler[j];
                    geciciMusteriler[j] = geciciMusteriler[j + 1];
                    geciciMusteriler[j + 1] = gecici;

                }
            }
        }
        for (int i = 0; i < musteriSayisi; i++) {
            System.out.println(geciciMusteriler[i]);
        }
    }


    public void musterileriListele() {
        for (int i = 0; i < musteriSayisi; i++) {
            System.out.println(musteriler[i]);
        }
    }

    public void musteriAra(String anahtarKelime) {
        boolean eslesmeVar = false;
        for (int i = 0; i < musteriSayisi; i++) {
            if (musteriler[i].eslesmeKontrol(anahtarKelime)) {
                System.out.println("Müşteri Bulundu. Müşteri Bilgisi: ");
                System.out.println( musteriler[i]);
                eslesmeVar = true;


            }

        }
        if (!eslesmeVar) {
            System.out.println("Müşteri Bulunamadı");

        }
    }

    public void musteriSil(int musteriNo) {
            int silinecekIndex = -1;

            for (int i = 0; i < musteriSayisi; i++) {
                if (musteriler[i].getMusteriNo() == musteriNo) {
                    silinecekIndex = i;
                    break; // Müşteriyi bulduk, döngüden çıkabiliriz
                }
            }

            if (silinecekIndex != -1) {
                // Silinecek müşteriyi bulduk
                for (int i = silinecekIndex; i < musteriSayisi - 1; i++) {
                    musteriler[i] = musteriler[i + 1];
                }
                musteriler[musteriSayisi - 1] = null; // Son elemanı sil
                musteriSayisi--;
                System.out.println("Müşteri Silindi!");
                for (int i = 0; i <musteriSayisi ; i++) {
                    System.out.println(musteriler[i]); //kalan müşterileri yazdırır
                }
            }
            else {
                System.out.println("Müşteri Bulunamadı!");
            }


    }
}


