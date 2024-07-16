import java.util.Scanner;

public class YerDegistirmeYontemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xa değerini giriniz: ");
        double xa = scanner.nextDouble();
        System.out.println("Xu değerini giriniz: ");
        double xu = scanner.nextDouble();
        System.out.println("Tolerans değerini girin: ");
        double eps = scanner.nextDouble();
        yerdegistirme(xa, xu, eps);

    }

    public static void yerdegistirme(double xa, double xu, double eps) {
        double xt = 14.7802;
        double xr_eski = 0;
        boolean durum = true;
        do {
            double xr = xu - (fonksiyon(xu) * (xa - xu)) / (fonksiyon(xa) - fonksiyon(xu));
            double Et = Math.abs((xt - xr) / xt) * 100;
            double Ea = Math.abs((xr - xu) / xr) * 100;
            System.out.printf("xa=%.6f      xr=%.6f     xu=%.6f     f(xa)=%.6f      f(xr)=%.6f      f(xu)=%.6f       Et=%.6f        Ea=%.6f\n",
                    xa, xr, xu, fonksiyon(xa), fonksiyon(xr), fonksiyon(xu), Et, Ea);


            if (fonksiyon(xa) * fonksiyon(xr) < 0) {
                xu = xr;
            } else {
                xa = xr;
            }

            xr_eski = xr;
            if (Ea < eps) {
                durum = false;
                System.out.println("Hata toleransı sağlandı.");
            }

        } while (durum);
    }

    public static double fonksiyon(double x) {
        return (667.38 / x) * (1 - Math.pow(Math.E, -0.146843 * x)) - 40;
    }
}
