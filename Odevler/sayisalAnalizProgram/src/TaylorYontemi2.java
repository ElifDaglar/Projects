import java.util.Scanner;

public class TaylorYontemi2 {
    public static void main(String[] args) {
        double h = 0.5;

        Scanner scanner = new Scanner(System.in);
        System.out.println("x değerini giriniz: ");
        double x = scanner.nextDouble();
        TaylorYontemi(x, h);
    }

    public static double fonksiyon(double xt) {
        return Math.pow(1+xt, 0.5);
    }

    public static void TaylorYontemi(double x, double h) {
        int n = 1;
        double xt = 1.5;
        double Et, Ea = 0;
        double gercekDeger = fonksiyon(xt);
        System.out.println(gercekDeger);


        double turev = 0.0;
        double hesaplama = fonksiyon(x);


        hesaplama += turev1(x,h)+turev2(x,h)+turev3(x,h);


        Et = Math.abs((gercekDeger - hesaplama) / gercekDeger) * 100;
        System.out.printf("n=%d,turev1=%.6f,turev2=%.6f,turev3=%.6f, hesaplama=%.6f Et=%.2f%%  Ea=%.6f \n", n, turev1(x, h), turev2(x, h), turev3(x, h), hesaplama, Et, Ea);


    }

    public static double factorial(int n) {
        double result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static double turev1(double x, double h) {
        return (0.5 * Math.pow(1 + x, -0.5) * Math.pow(h, 1)) / factorial(1);
    }

    public static double turev2(double x, double h) {
        return (-0.25 * Math.pow(1 + x, -1.5) * Math.pow(h, 2)) / factorial(2);
    }

    public static double turev3(double x, double h) {
        return (0.375 * Math.pow(1 + x, -1.5) * Math.pow(h, 3)) / factorial(3);
    }
}




