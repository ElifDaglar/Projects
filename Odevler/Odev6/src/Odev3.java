import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Odev3 {
    public static void main(String[] args) {
        int count=2;
        for (int i = 0; i <count ; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Telefon numarasını girin: ");
            String phoneNumber = scanner.nextLine();
            if (isValidPhoneNumber(phoneNumber)) {
                System.out.println("Doğrulanmış telefon numarası: " + phoneNumber);
            } else {
                System.out.println("Geçersiz telefon numarası.");
            }
        }

    }
    private static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^(?!0)\\(\\d{3}\\) \\d{3}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
