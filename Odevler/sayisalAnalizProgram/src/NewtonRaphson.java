public class NewtonRaphson {
    public static void main(String[] args) {
       newtonRaphsonSonuc(0);
    }

    public static double f(double x) {
        return Math.pow(Math.E,-x)-x;
    }

    public static double fTurev(double x) {
            return -Math.pow(Math.E, -x) - 1;
        }


    public static void newtonRaphsonSonuc(double x) {
        double xT = 0.567143;
        double xTolerans;
        double iter = 0.01;
        boolean durum = true;
        xTolerans = (Math.abs((xT - x) / xT) * 100);
        double Ea, sonuc;
        System.out.printf("xsonuç=%.10f       Ea=%.6f                             f(x)=%.6f       f'(x)=%.6f\n", x, xTolerans,f(x),fTurev(x));

        do {
            sonuc = x;
            x =  x - f(x) / fTurev(x);
            xTolerans = (Math.abs((xT - x) / xT) * 100);
            Ea = (Math.abs(x - sonuc) / x * 100);
            System.out.printf("xsonuç=%.10f       Ea=%.6f        ,Et=%.7f        f(x)=%.6f       f'(x)=%.6f\n", x, xTolerans, Ea,f(x),fTurev(x));

            if (Ea < iter) {
                durum = false;
            }

        } while (durum);
    }

    }
