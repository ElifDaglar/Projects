import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {
    int count=2;
        for (int i = 0; i <count ; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Girilen metin: ");
            String text = scanner.nextLine();
            if (text.startsWith("WWW")) {
                text = "www" + text.substring(3);
            }
            if (text.endsWith(".com.tr")) {
                text = text + " - Ticari ";
            }
            int firstZ = text.indexOf("z");
            System.out.println("İlk İndex: " + firstZ);
            int lastZ = text.lastIndexOf("z");
            System.out.println("Son İndex: " + lastZ);

            String newText = text.substring(firstZ, lastZ+1);
            String finalText = (text + " " +newText).toLowerCase();
            System.out.println("İşlemler sonucunda elde edilen metin: " + finalText.trim());
        }
    }
}