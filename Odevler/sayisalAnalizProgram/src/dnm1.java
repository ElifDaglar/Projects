import java.util.Scanner;

public class dnm1 {
    public static void main(String[] args) {
        int i, nn, maxit;
        float es, rr, ss, rootReal, rootImage;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Maksimum iterasyon sayısını giriniz: ");
            maxit = input.nextInt();
            System.out.println("Tolerans hata % sini giriniz: ");
            es = input.nextFloat();
            System.out.println("r değerini giriniz: ");
            rr = input.nextFloat();
            System.out.println("s değerini giriniz: ");
            ss = input.nextFloat();
            System.out.println("Polinom derecesini giriniz: ");
            nn = input.nextInt();
            float[] a = new float[nn + 1];
            for (int j = nn; j >= 0; j--) {
                System.out.print("a(" + j + ")=");
                a[j] = input.nextFloat();

            }
            //POLİNOMUN ELEMANLARINI ATAMA
            elemanYazdirma(nn, a);
            bairstowMetodu(a, nn + 1, es, rr, ss, maxit);

            System.out.println("\nPolinomun derece düşürme sonrası: ");
            elemanYazdirma(nn, a);

        }

    }

    private static void elemanYazdirma(int n, float[] a) {
        for (int i = n; i >= 0; i--) {
            System.out.printf("a(%d)=%4.2f  ", i, a[i]);
        }
    }

    private static void bairstowMetodu(float[] a, int nn, float es, float rr, float ss, int maxit) {
        int  n = nn, iter = 0;
        float[] b = new float[n];
        float[] c = new float[n];
        float r = rr, s = ss, det, dr, ds, ea1 = 1.f, ea2 = 1.f;
        while (n > 3 || iter < maxit) {
            iter = 0;
            do {
                iter++;
                b[n] = a[n];
                b[n - 1] = a[n - 1] + r * b[n];
                c[n] = b[n];
                b[n - 1] = b[n - 1] + r * c[n];
                for (int j = n - 2; j >= 0; j--) {
                    b[j] = a[j] + r * b[j + 1] + s * b[j + 2];
                    c[j] = b[j] + r * c[j + 1] + s * c[j + 2];
                }
                det = c[2] * c[2] - c[3] * c[1];
                if (det != 0) {
                    dr = (-b[1] * c[2] + b[0] * c[3]) / det;
                    ds = (-b[0] * c[2] + b[1] * c[1]) / det;
                    r = r + dr;
                    s = s + ds;

                    if (r != 0) {
                        ea1 = Math.abs(dr / r) * 100;

                    }
                    if (s != 0) {
                        ea2 = Math.abs(ds / s) * 100;
                    }
                } else {
                    r++;
                    s++;
                    iter = 0;
                }
            } while (ea1 >= es && ea2 >= es && iter <= maxit);
        }

    }
    public static class  DereceDusurme {
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

    private static void Quadroot(double r){

    }
}
