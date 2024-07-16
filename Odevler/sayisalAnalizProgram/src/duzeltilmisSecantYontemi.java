import java.util.Scanner;

public class duzeltilmisSecantYontemi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("xi değeri girin: ");
        double xi = scanner.nextDouble();
        double fi = 0.01;
        double xT = 0.56714329;
        double errorTolerans = 0.005;

        int iter = 0;
        int imax = 150;
        duzeltilmisSecHesaplama(fi, xi, errorTolerans, xT);

    }

    public static void duzeltilmisSecHesaplama(double fi, double xi, double errorTolerans, double xT) {
        int iter = 0;
        int iMax = 150;
        double  x_i,xA;
        x_i = xi - (fi * xi * fonk(xi)) / (fonk(xi + (fi * xi)) - fonk(xi));



        System.out.printf("iter=%d      sonucX=%.6f      x0+fi*x0=%.6f        f(x0)=%.6f      f(x0+fix0)=%.6f     errT=%.8f\n", iter, xi, f(xi, fi), fonk(xi), fonk(xi + fi * xi), xTolerans(x_i,xT));

        boolean durum = true;
        do {
            double oldXi=xi;
            x_i = xi - (fi * xi * fonk(xi)) / (fonk(xi + (fi * xi)) - fonk(xi));
            xi = x_i;

            iter++;

            xA=Math.abs((x_i-oldXi)/x_i*100);
            System.out.printf("iter=%d      sonucX=%.6f      x0+fi*x0=%.6f        f(x0)=%.6f      f(x0+fix0)=%.6f     errT=%.8f      errA=%.6f\n", iter, x_i, f(xi, fi), fonk(xi), fonk(xi + fi * xi), xTolerans(x_i,xT),xA);
            if (iter == iMax) {
                durum = false;
            }
            if (xTolerans(xi,xT) <= errorTolerans) {
                durum = false;
            }
        } while (durum);


    }


    public static double fonk(double x) {
        return Math.pow(Math.E, -x) - x;
    }

    public static double f(double xi, double fi) {
        return xi + (fi * xi);
    }
    public static double xTolerans(double xi,double xT){
        return Math.abs((xT-xi)/xT*100);
    }


}
