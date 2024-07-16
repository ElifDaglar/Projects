import java.util.Scanner;

public class Taylor { //farkı ve hesaplanacak x değerini gir
    public static void main(String[] args) {
        double h = 0.5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("x değerini giriniz: ");
        double x = scanner.nextDouble();
        TaylorYontemi(x, h);
    }

    public static double fonksiyon(double x) {
        return x * Math.pow(Math.E, x);
    }

    public static void TaylorYontemi(double x, double h) {
        boolean durum = true;
        int n = 1;
        int xt = 2;
        double Et, Ea = 0;
        double gercekDeger = fonksiyon(xt);
        System.out.println(gercekDeger);

        do {
            double turev = 0.0;
            double hesaplama = fonksiyon(x);
            double eskiDeger = 0;

            for (int i = 1; i <= n; i++) {
                turev = (x + i) * Math.pow(Math.E, x) * Math.pow(h, i) / factorial(i);
                eskiDeger = hesaplama;
                hesaplama += turev;
                Ea = Math.abs((hesaplama - eskiDeger) / hesaplama) * 100;

            }

            Et = Math.abs((gercekDeger - hesaplama) / gercekDeger) * 100;
            System.out.printf("n=%d, f(x)=%.6f,turev=%.6f, hesaplama=%.6f Et=%.2f%%  Ea=%.6f \n", n, eskiDeger, turev, hesaplama, Et, Ea);
            n++;

            if (Et < 0.01) {
                durum = false;
            }
        } while (durum);
    }

    public static double factorial(int n) {
        double result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
