import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoubleLinkList doubleLinkList = new DoubleLinkList<>();

        while (true) {
            System.out.println("------------------Şehir Menüsü--------------------------------");
            System.out.println("1. Şehir Ekle");
            System.out.println("2. Şehir Listele İleriye Doğru");
            System.out.println("3. Şehir Listele Geriye Doğru");
            System.out.println("4. Şehir Listele (Nüfusa göre küçükten büyüğe)");
            System.out.println("5. Şehir Ara (Plaka No veya Şehir ismi ile)");
            System.out.println("6. Şehir Sil (Plaka No, Şehir İsmi veya Tamamı)");
            System.out.println("7. Tüm Şehirleri Sil");
            System.out.println("8. Çıkış");
            System.out.println("Bir seçenek seçin: ");

            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("Şehir adını girin: ");
                    String sehirAd = scanner.nextLine();
                    System.out.print("Şehrin nüfus bilgilerini girin: ");
                    long sehirNufusu = scanner.nextLong();
                    Sehir yeniSehir = new Sehir(sehirNufusu, sehirAd);
                    doubleLinkList.insert(yeniSehir);
                    break;
                case 2:
                    System.out.println("------------------İleriye Doğru Listele------------------");
                    doubleLinkList.displayForward();
                    break;
                case 3:
                    System.out.println("----------------Geriye Doğru Listele-----------------------");
                    doubleLinkList.displayBackward();
                    break;
                case 4:
                    System.out.println("Nüfusa göre küçükten büyüğe sıralanmış liste:");
                    doubleLinkList.sortList();
                    doubleLinkList.displayForward();
                    break;
                case 5:
                    System.out.print("Aranacak şehir bilgisini girin (Plaka No veya Şehir ismi): ");
                    String searchKey = scanner.nextLine();
                    try {
                        int plakaNo = Integer.parseInt(searchKey);
                        doubleLinkList.find(plakaNo);
                    } catch (NumberFormatException e) {
                        doubleLinkList.find(searchKey);
                    }
                    break;
                case 6:
                    System.out.println("Silinecek şehir bilgisini girin (Plaka No veya Şehir ismi): ");
                    String deleteKey = scanner.nextLine();
                    try {
                        int plakaNo = Integer.parseInt(deleteKey);
                        doubleLinkList.delete(plakaNo);
                    } catch (NumberFormatException e) {
                        doubleLinkList.delete(deleteKey);
                    }
                    break;
                case 7:
                    doubleLinkList.delete();
                    break;
                case 8:
                    System.out.println("Şehir Yönetimi Uygulamasından Çıkılıyor.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçenek. Lütfen tekrar deneyin.");
            }
        }
    }
}

