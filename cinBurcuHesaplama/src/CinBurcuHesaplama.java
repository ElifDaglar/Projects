import java.util.Scanner;
public class CinBurcuHesaplama {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Doğum Yılınızı Giriniz: ");
            int dogumTarihi = scanner.nextInt();
            String bilgi = "Çin Zodyağı Burcunuz: \n";
            if (dogumTarihi < 1000) {
                System.out.println("Doğum tarihiniz 4 haneli olmalıdır.");
            }
            else if (dogumTarihi % 12 == 0) {
                System.out.println(bilgi + "Maymun");
            } else if (dogumTarihi % 12 == 1) {
                System.out.println(bilgi + "Horoz");
            } else if (dogumTarihi % 12 == 2) {
                System.out.println(bilgi + "Köpek");
            } else if (dogumTarihi % 12 == 3) {
                System.out.println(bilgi + "Domuz");
            } else if (dogumTarihi % 12 == 4) {
                System.out.println(bilgi + "Fare");
            } else if (dogumTarihi % 12 == 5) {
                System.out.println(bilgi + "Öküz");
            } else if (dogumTarihi % 12 == 6) {
                System.out.println(bilgi + "Kaplan");
            } else if (dogumTarihi % 12 == 7) {
                System.out.println(bilgi + "Tavşan");
            } else if (dogumTarihi % 12 == 8) {
                System.out.println(bilgi + "Ejderha");
            } else if (dogumTarihi % 12 == 9) {
                System.out.println(bilgi + "Yılan");
            } else if (dogumTarihi % 12 == 10) {
                System.out.println(bilgi + "At");
            } else if (dogumTarihi % 12 == 11) {
                System.out.println(bilgi + "Koyun");
            } else {
                System.out.println("Hatalı değer girdiniz!");
            }

        }
    }

