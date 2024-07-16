import java.util.Scanner;

public class MullerYontemi {
    public static void main(String[] args) {
                int maxIt;
               float eps, h, xr;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Maksimum iterasyon değerini girin:");
                maxIt = scanner.nextInt();
                System.out.println("xr değerini girin:");
                xr = scanner.nextFloat();
                System.out.println("h değerini girin:");
                h = scanner.nextFloat();
                System.out.printf("Tolerans değerini giriniz: ");
                eps = scanner.nextFloat();
                muller(xr, h, eps, maxIt);
            }

            public static double fonksiyon(double x) {
                return Math.pow(x, 3) +Math.pow(x,2)-4*x-4;
            }


            public static void muller(float xr, float h, float eps, int maxIt) {
                int iter = 0;
                float x0, x1, x2, h0, h1, delta0, delta1, a, b, c, diskriminant, den, dxr, hata;
                x2 = xr;
                x1 = xr + h * xr;
                x0 = xr - h * xr;
                System.out.printf("\n\titerasyon\t Xroot\t\t eps\n--------------------------------------------------------------");
                System.out.printf("\n\t     %d\t\t%.6f", iter, xr);
                do {
                    iter++;
                    h0 = x1 - x0;
                    h1 = x2 - x1;
                    delta0 = (float) ((fonksiyon(x1) - fonksiyon(x0)) / h0);
                    delta1 = (float) ((fonksiyon(x2) - fonksiyon(x1)) / h1);
                    a = (delta1 - delta0) / (h1 + h0);
                    b = a * h1 + delta1;
                    c = (float) fonksiyon(x2);
                    diskriminant = (float) Math.sqrt(Math.pow(b, 2) - 4 * a * c);
                    if (Math.abs(b + diskriminant) > Math.abs(b - diskriminant)) {
                        den = b + diskriminant;
                    } else {
                        den = b - diskriminant;
                    }
                    dxr = -2 * c / den;
                    xr = x2 + dxr;
                    hata = Math.abs((xr - x2) / xr) * 100;
                    System.out.printf("\n\t     %d\t\t%.6f\t%.8f", iter, xr, hata);
                    x0 = x1;
                    x1 = x2;
                    x2 = xr;
                } while (hata > eps && iter < maxIt);
            }
        }