public class problem62a {
    public static void main(String[] args) {
        sabitNokIterasyon(5);
    }

    public static double f(double x) {
        return Math.pow(((1.7*x+2.5)/0.9),0.5);
    }

    public static void sabitNokIterasyon(double x) {
        double xT = 2.860104;
        double xTolerans;
        double iter = 0.01;
        boolean durum = true;
        xTolerans = (Math.abs((xT - x) / xT) * 100);
        double Ea;
        double sonuc =x;
        System.out.printf("x=%.6f       ErrTolerans=%.6f\n", x, xTolerans);
        do {
            sonuc = x;
            x = f(x);
            xTolerans = (Math.abs((xT - x) / xT) * 100);
            Ea = (Math.abs(x - sonuc) / x * 100);
            System.out.printf("x=%.6f       ErrTolerans=%.6f        ,Ea=%.6f\n", x, xTolerans, Ea);

            if (Ea <= iter) {
                durum = false;
            }

        } while (durum);
    }
}






