import java.util.Scanner;

public class sekantYontemi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("x0 değerini giriniz: ");
        double x0 = scanner.nextDouble();
        System.out.println("xi değerini giriniz: ");
        double xi = scanner.nextDouble();

        sekantYontemiHesaplama(x0, xi);
    }


    public static double f(double x) {
        return Math.pow(Math.E, -x) - x;
    }

    public static void sekantYontemiHesaplama(double x0, double xi) {
        double xT = 0.56714329;
        double xTolerans;
        double xi1 = 1;
        double errorTolerans = 0.005;
        int iter = 0;
        int iMax = 150;
        boolean durum = true;
        do {
            xTolerans = Math.abs((xT - xi1) / xT * 100);
            System.out.printf("iterasyon=%d     x0=%.5f   xi=%f      f(x0)=%.5f        f(xi1)=%.5f      XTolerans=%.6f\n", iter, x0, xi, f(x0), f(xi1), xTolerans);
            xi1 = xi - ((f(xi) * (x0 - xi)) / (f(x0) - f(xi)));
            x0 = xi;
            xi = xi1;
            iter++;

            if (iter == iMax) {
                durum = false;
            }
            if (xTolerans <= errorTolerans) {
                durum = false;
            }
        } while (durum);


    }
}
