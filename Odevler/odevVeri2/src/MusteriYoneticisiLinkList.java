public class MusteriYoneticisiLinkList {

    Link head;


    public MusteriYoneticisiLinkList() {
        head = null;


    }

    public void musteriEkle(Musteri musteri) {
        int maksimumMusteriSayisi = 10;
        int mevcutMusteriSayisi = 0;

        // Bağlı listenin boyutunu hesapla
        Link temp = head;
        while (temp != null) {
            mevcutMusteriSayisi++;
            temp = temp.next;
        }

        if (mevcutMusteriSayisi >= maksimumMusteriSayisi) {
            System.out.println("Maksimum müşteri sayısına ulaşıldı. Yeni müşteri eklenemez.");
            return;
        }

        Link newLink = new Link(musteri);

        if (head == null) {
            head = newLink;
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newLink;
        }

        System.out.println("Müşteri Eklendi!" + musteri);

    }



    public void musterileriSiralamaListele() {
        if (head == null) {
            System.out.println("Listede hiç müşteri yok.");
            return;
        }

        // Bağlı listedeki eleman sayısını hesapladım
        int count = 0;
        Link current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        // Linked List'i sıralamak için bir geçici dizi oluşturdum
        Link[] tempArray = new Link[count];
        current = head;
        int index = 0;
        while (current != null) {
            tempArray[index] = current;
            current = current.next;
            index++;
        }

        // Diziyi müşteri numarasına göre sıraladım
        for (int i = 0; i < tempArray.length - 1; i++) {
            for (int j = 0; j < tempArray.length - i - 1; j++) {
                if (tempArray[j].musteri.getMusteriNo() > tempArray[j + 1].musteri.getMusteriNo()) {
                    Link temp = tempArray[j];
                    tempArray[j] = tempArray[j + 1];
                    tempArray[j + 1] = temp;
                }
            }
        }

        // Sıralanmış müşterileri listeleyin
        for (Link link : tempArray) {
            System.out.println(link);
        }
    }


    public void musterileriListele() {
        Link temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }


    public void musteriAra(String anahtarKelime) {
        boolean eslesmeKontrol=false;
        Link temp = head;
        while (temp != null) {
            if (temp.musteri.eslesmeKontrol(anahtarKelime)) {
                System.out.println("Müşteri Bulundu: " + temp);
                eslesmeKontrol=true;
            }
            temp = temp.next;
        }if (!eslesmeKontrol)
        System.out.println("Müşteri bulunamadı.");
    }

    public void musteriSil(int MusteriNo) {
        Link current = head;
        Link previous = null;

        while (current != null) {
            if (current.toString().contains("Müşteri No: " + MusteriNo)) {
                if (previous != null) {
                    previous.next = current.next;
                } else {
                    head = current.next;
                }
                System.out.println("Müşteri silindi: ");
                break;
            }
            previous = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Müşteri bulunamadı.");
        } else {

            System.out.println("Kalan Müşteriler:");
            musterileriListele();
        }
    }
}


