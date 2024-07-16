public class problem61 {
    public static void main(String[] args) {
        sabitNokIterasyon(0.5);
    }

    public static double f(double x) {
        return Math.sin(Math.pow(x, 0.5))-x;
    }

    public static void sabitNokIterasyon(double x) {
        double xT = 0.768649;
        double xTolerans;
        double iter = 0.0;
        boolean durum = true;
        xTolerans = (Math.abs((xT - x) / xT) * 100);
        double Ea, sonuc;
        System.out.printf("x=%.6f       ErrTolerans=%.6f\n", x, xTolerans);

        do {
            sonuc = x;
            x = f(x)+x;
            xTolerans = (Math.abs((xT - x) / xT) * 100);
            Ea = (Math.abs(x - sonuc) / x * 100);
            System.out.printf("x=%.6f       ErrTolerans=%.6f        ,Ea=%.6f\n", x, xTolerans, Ea);

            if (Ea <= iter) {
                durum = false;
            }

        } while (durum);
    }
}

