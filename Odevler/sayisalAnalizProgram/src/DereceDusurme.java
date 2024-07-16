import java.util.Scanner;

public class DereceDusurme {
    public static void main(String[] args) {
        int n;
        float root;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Olası kök derecesini giriniz: ");
            root = input.nextFloat();
            System.out.println("Dizinin derecesini giriniz: ");
            n = input.nextInt();
            float[] a = new float[n + 1];
            for (int i = n; i >= 0; i--) {
                System.out.print("a(" + i + ")=");
                a[i] = input.nextFloat();

            }
            elemanYazdirma(n, a);
            polinomDereceDusurme(n, a, root);
            System.out.println("\nPolinomun derece düşürme sonrası:");
            elemanYazdirma(n,a);
        }

    }

    public static void polinomDereceDusurme(int n, float[] a, float t) {
        int i = n - 1;
        float r = a[n], s;
        a[n] = 0;
        do {
            s = a[i];
            a[i] = r;
            r = s + r * t;
            i--;

        } while (i >= 0);
        System.out.printf("\nr=%.3f", r);
        if (r != 0) {
            System.out.println("\nBaşarısız!!!");
        } else {
            System.out.println("\nBaşarılı!!!");
        }
    }

    private static void elemanYazdirma(int n, float[] a) {
        for (int i = n; i >= 0; i--) {
            System.out.printf("a(%d)=%4.2f  ", i, a[i]);
        }
    }
}
