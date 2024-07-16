public class DoubleLinkList<Type> {
    public Link head;
    public Link tail;

    public DoubleLinkList() {
        head = null; //başlangıçta ikisini de boş alıyoruz.
        tail = null;
    }

    public boolean isEmpty() {
        while (tail != null && head != null) {
            return false;
        }
        return true;

    }
    public void insert(Sehir sehir) {
        Link newLink = new Link(sehir);
        // Aynı isimli şehir kontrolü
        if (contains(sehir.sehirAd)) {
            System.out.println("Aynı isimli iki şehir eklenemez.");
            return;
        }
        if (isEmpty()) {
            head = newLink; // ilk elemanı ekledik
            tail = newLink;
        } else {
            Link current = head;
            while (current != null && sehir.sehirAd.compareTo(current.sehir.sehirAd) > 0) {
                current = current.next;
            }
            if (current == null) { // sehri liste sonuna ekledik
                tail.next = newLink;
                newLink.previous = tail;
                tail = newLink;
            } else if (current == head) { // sehri liste başına ekledik
                newLink.next = head;
                head.previous = newLink;
                head = newLink;
            } else {
                newLink.next = current;
                newLink.previous = current.previous;
                current.previous.next = newLink;
                current.previous = newLink;
            }
        }
        plakaNoUpdate();
    }

    public boolean contains(String sehirAd) {
        Link current = head;
        while (current != null) {
            if (current.sehir.sehirAd.equalsIgnoreCase(sehirAd)) {
                return true;
            }
            current = current.next;
        }
        return false;
}

    public void plakaNoUpdate() {
        Link temp = head;
        int plakaNo = 1;

        while (temp != null) { // her şehir eklendiğinde plaka no bir artırılır.
            temp.sehir.setPlakaNo(plakaNo);
            plakaNo++;
            temp = temp.next;
        }
    }


    public void delete(String sehirAd) { // şehir adına göre şehir silme methodu.
        Link temp = head;

        while (temp != null) {
            if (temp.sehir.sehirAd.equalsIgnoreCase(sehirAd)) {
                if (temp == head) {
                    head = temp.next;
                } else {
                    temp.previous.next = temp.next;
                    if (temp == tail) {
                        tail = temp.previous;
                    } else {
                        temp.next.previous = temp.previous;
                    }
                }

                System.out.println("Şehir Silindi.");

                // Şehir silindiğinde listeyi alfabetik sıraya göre sıraladım.
                sortList();
                plakaNoUpdate(); //plaka numaralarını tekrar güncelledim.

                return;
            }

            temp = temp.next;
        }

        System.out.println("Şehir Bulunamadı");
    }

    public void delete(int plakaNo) { //plaka no'ya göre şehir silme methodu.
        Link temp = head;

        while (temp != null) { //Listedeki her bağlantı kontrol edilir.
            if (temp.sehir.getPlakaNo() == plakaNo) {
                if (temp == head) { //Silinecek eleman listenin başında mı bunu kontrol eder.
                    head = temp.next;
                } else {
                    temp.previous.next = temp.next;
                    if (temp == tail) { //Silinecek eleman listenin sonunda mı bunu kontrol eder.
                        tail = temp.previous;
                    } else {
                        temp.next.previous = temp.previous;
                    }
                }

                System.out.println("Şehir silindi!");

                // Şehir silindiğinde plakaları güncelledim.
                plakaNoUpdate();

                return;
            }

            temp = temp.next;
        }

        System.out.println("Aranan şehir bulunamadı!");
    }


    public void delete() {
        // Tüm şehirleri silmek için başlangıç noktasını belirledim
        Link temp = head;
        while (temp != null) {//Listedeki her bağlantı kontrol edilir.
            Link next = temp.next;
            delete(temp.sehir.getPlakaNo()); // delete metodunu kullanarak şehiri sildim.
            temp = next;
        }

        System.out.println("Listedeki tüm şehirler silindi.");
    }

    public void find(int plakaNo) {
        Link temp = head;
        while (temp != null) {
            if (temp.sehir.plakaNo == plakaNo) { //aranan plaka no ile girilen plaka no aynı mı kontorl eder.
                System.out.println("Plaka No: " + temp.sehir.plakaNo);
                System.out.println("Nüfus: " + temp.sehir.nufus);
                System.out.println("Şehir İsmi: " + temp.sehir.sehirAd);
                System.out.println("------------------------");
            }
            temp = temp.next;
        }
    }


    public void find(String sehirAd) {
        Link temp = head;
        while (temp != null) {
            if (temp.sehir.sehirAd.equals(sehirAd)) { //aranan şehir adı ile girilen şehir adı aynı mı kontrol eder.
                System.out.println("Plaka No: " + temp.sehir.plakaNo);
                System.out.println("Nüfus: " + temp.sehir.nufus);
                System.out.println("Şehir İsmi: " + temp.sehir.sehirAd);
                System.out.println("------------------------");
            }

            temp = temp.next;
        }
    }


    public void sortList() { //Bu metod, bağlı listedeki şehirleri nüfuslarına göre küçükten büyüğe sıralamayı amaçlar.
        Link current = head;
        Link index = null;
        Sehir temp;

        if (isEmpty()) {
            return;
        } else {
            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.sehir.nufus > index.sehir.nufus) {
                        temp = current.sehir;
                        current.sehir = index.sehir;
                        index.sehir = temp;
                    }

                    index = index.next;
                }

                current = current.next;
            }
        }
    }

    public void displayForward() { //Bu metod, bağlı listedeki şehirleri baştan sona doğru yazdırmak için kullanılır.
        Link temp = head;
        while (temp != null) {
            System.out.println("Plaka No: " + temp.sehir.plakaNo);
            System.out.println("Nüfus: " + temp.sehir.nufus);
            System.out.println("Şehir İsmi: " + temp.sehir.sehirAd);
            System.out.println("------------------------");
            temp = temp.next;
        }
    }


    public void displayBackward() { //Bu metod, bağlı listedeki şehirleri sondan başa doğru yazdırmak için kullanılır.
        Link temp = tail;
        while (temp != null) {
            System.out.println("Plaka No: " + temp.sehir.plakaNo);
            System.out.println("Nüfus: " + temp.sehir.nufus);
            System.out.println("Şehir İsmi: " + temp.sehir.sehirAd);
            System.out.println("------------------------");
            temp = temp.previous;
        }
    }
}
