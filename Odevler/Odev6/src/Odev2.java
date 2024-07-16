import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        int count = 2;
        for (int i = 0; i < count; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Plakayı girin: ");
            String plate = scanner.nextLine();


            if (isPlateValid(plate)) {
                System.out.println("Plaka uygun formatta.");
            } else {
                System.out.println("Plaka uygun formatta değil.");
            }


        }
    }

    private static boolean isPlateValid(String plate) {
        List<String> stringList = new ArrayList<>();
        List<String> digitList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder digitBuilder = new StringBuilder();

        for (char c : plate.toCharArray()) {
            if (Character.isDigit(c)) {
                digitBuilder.append(c);
            } else if (Character.isLetter(c)) {
                stringBuilder.append(Character.toUpperCase(c));
            }
        }
        if (stringBuilder.length() > 0) {
            stringList.add(stringBuilder.toString().trim());
        }
        if (digitBuilder.length() > 0) {
            digitList.add(digitBuilder.toString().trim());
        }
        for (String string : stringList
        ) {
            for (String string2 : digitList
            ) {
                if (string.length() == 2 && string2.length() == 5) {
                    return true;
                }
            }

        }
        return false;
    }

}


