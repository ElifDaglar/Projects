import java.util.Scanner;

public class ikiyeBolme { //Ea değerini bir kaydır
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("fonksiyonun değerini girin: ");
        double xg=scanner.nextDouble();
        System.out.println("Xa değerini giriniz: ");
        double xa = scanner.nextDouble();
        System.out.println("Xu değerini giriniz: ");
        double xu = scanner.nextDouble();
        System.out.println("Tolerans değerini girin: ");
        double eps = scanner.nextDouble();
        ikiyeBolmeYontemi(xa, xu, eps,xg);
    }

    public static double fonksiyon(double x) {
        return (Math.pow(x, 3.5) - 80);
    }

    public static void ikiyeBolmeYontemi(double xa, double xu, double eps,double xg) {
        boolean durum = true;
        int count = 0;

        double Ea = 0, Et = 0;
        double xr, f_xr, xr_eski = 0;

        do {
            count++;
            xr = (xa + xu) / 2;
            f_xr = fonksiyon(xr);

            Ea = Math.abs((xr - xr_eski) / xr) * 100;
            Et = Math.abs((xg - xr) / xg) * 100;

            System.out.printf("n=%d   xa=%.6f      xr=%.6f     xu=%.6f     f(xa)=%.6f      f(xr)=%.6f      f(xu)=%.6f       Et=%.6f        Ea=%.6f\n",
                    count, xa, xr, xu, fonksiyon(xa), f_xr, fonksiyon(xu), Et, Ea);


            if (fonksiyon(xa) * f_xr < 0) {
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
}



