import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x0, y0, xT, yT, errorTolerans;
        int iMax;
        xT = 2;
        yT = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("x0 değerini giriniz: ");
        x0 = scanner.nextDouble();
        System.out.println("y0 değerini giriniz: ");
        y0 = scanner.nextDouble();
        errorTolerans = 0.00001;
        iMax = 150;

        newtonRapshonCalculation(x0, y0, xT, yT, errorTolerans, iMax);
    }

    public static double Ufonk(double x0, double y0) {
        return Math.pow(x0, 2) + x0 * y0 - 10;
    }

    public static double Vfonk(double x0, double y0) {
        return y0 + (3 * x0 * (Math.pow(y0, 2))) - 57;
    }

    public static double xTurevU(double x0, double y0) {
        return 2 * x0 + y0;

    }

    public static double yTurevU(double x0, double y0) {
        return x0;

    }

    public static double xTurevV(double x0, double y0) {
        return 3 * Math.pow(y0, 2);
    }

    public static double yTurevV(double x0, double y0) {
        return 1 + 6 * x0 * y0;
    }

    public static void newtonRapshonCalculation(double x0, double y0, double xT, double yT, double errorTolerans, int iMax) {
        boolean durum = true;
        int iter = 0;
        double xRoot, yRoot, functionU, functionV, turevU_x, turevU_y, turevV_x, turevV_y, toleransX, toleransY;
        System.out.printf("iter=%d      x=%.6f      y=%.6f\n", iter, x0, y0);

        do {
            functionU = Ufonk(x0, y0);
            functionV = Vfonk(x0, y0);
            turevU_x = xTurevU(x0, y0);
            turevU_y = yTurevU(x0, y0);
            turevV_x = xTurevV(x0, y0);
            turevV_y = yTurevV(x0, y0);
            double payda = turevU_x * turevV_y - turevU_y * turevV_x;

            xRoot = x0 - (functionU * turevV_y - functionV * turevU_y) / payda;
            yRoot = y0 - (functionV * turevU_x - functionU * turevV_x) / payda;
            toleransX = Math.abs((xT - xRoot) / xT * 100);
            toleransY = Math.abs((yT - yRoot) / yT * 100);
            iter++;
            System.out.printf("iter=%d      x=%.6f      y=%.6f      ErrorX=%.6f     ErrorY=%.6f\n", iter, xRoot, yRoot, toleransX, toleransY);
            if (iter == iMax) {
                durum = false;
            }
            if (toleransX <= errorTolerans && toleransY <= errorTolerans) {
                durum = false;
            }
            x0 = xRoot;
            y0 = yRoot;
        }
        while (durum);
    }
}
