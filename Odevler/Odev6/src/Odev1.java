import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci stringi girin: ");
        String string1 = scanner.nextLine();
        System.out.println("İkinci stringi girin: ");
        String string2 = scanner.nextLine();


        if (string1.equals(string2)) {
            System.out.println("Stringler aynıdır.");
        } else {
            System.out.println("İki string farklıdır.");
        }
        if (string1.equalsIgnoreCase(string2))
            System.out.println("İki string büyük/küçük harf farkını yok sayarak aynıdır.");


        if (string1.compareTo(string2) < string2.compareTo(string1)) {
            System.out.println("Birinci string, ikinci stringden leksikografik olarak öncedir.");
        } else if (string2.compareTo(string1) < string1.compareTo(string2)) {
            System.out.println("İkinci string, birinci stringden leksikografik olarak öncedir.");
        } else {
            System.out.println("Stringler leksikografik olarak aynıdır.");
        }


        System.out.println("Karşılaştırma için başlangıç indisini girin: ");
        int index = scanner.nextInt();
        System.out.println("Karşılaştırma için kaç karakterin kontrol edileceğini girin: ");
        int control = scanner.nextInt();
        if (string1.regionMatches(index, string2, index, control)) {
            System.out.println("Belirtilen bölgelerdeki karakterler aynıdır.");
        } else {
            System.out.println("Belirtilen bölgelerdeki karakterler aynı değildir.");
        }

    }
}
