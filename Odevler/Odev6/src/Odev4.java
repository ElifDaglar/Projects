import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tweet metnini giriniz: ");
        String text = scanner.nextLine();

        String abbreviatedText = abbreviatedText(text);
        System.out.println("Kısaltılmış metin: " + "\n" + abbreviatedText);
    }

    private static String abbreviatedText(String text) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("mrb");
        arrayList.add("evt");
        arrayList.add("tşk");
        arrayList.add("bb");

        for (String str : arrayList) {
            text = text.replace("Merhaba", arrayList.get(0));
            text = text.replace("evet", arrayList.get(1));
            text = text.replace("Teşekkürler", arrayList.get(2));
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (char c : text.toCharArray()) {
            stringBuilder.append(c);
            if (stringBuilder.length() > 0) {
                arrayList.add(stringBuilder.toString());
            }
        }

        int maxLength = 40;
        if (text.length() > maxLength) {
            text = text.substring(0, maxLength - 3) + "...";
        }

        List<String> lines = new ArrayList<>();
        int startIndex = 0;
        while (startIndex < text.length()) {
            int endIndex = Math.min(startIndex + 40, text.length());//metnin uzunluğunu aşmaması için
            lines.add(text.substring(startIndex, endIndex));
            startIndex = endIndex;
        }

        return text;
    }
}
