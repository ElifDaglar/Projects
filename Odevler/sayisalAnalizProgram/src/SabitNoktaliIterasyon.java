import java.util.Scanner;

public class SabitNoktaliIterasyon {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("x değerini giriniz: ");
        double xi=scanner.nextDouble();
        System.out.println("y değerini giriniz: ");
        double yi=scanner.nextDouble();

        sabitNoktaliIterasyonHesaplama(xi,yi);
    }
    public static double x_i(double xi,double yi){
        double a=Math.pow(xi,2);
        return (10-a)/yi;

    }


    public static double y_i(double xi,double yi){
        return 57-(3*xi*(Math.pow(yi,2)));

    }
    public static void  sabitNoktaliIterasyonHesaplama(double xi,double yi){
        double x,y,toleransX,toleransY;
        boolean durum=true;
        double errorTolerans=0.005;
        int xT=2;
        int yT=3;
        int iter=0;
        int iMax=150;

        System.out.printf("iter=%d      x=%.6f      y=%.6f\n", iter, xi, yi );
        do{
           xi= x_i(xi,yi);
           yi=y_i(xi,yi);
            toleransX = Math.abs((xT - xi) / xT * 100);
            toleransY = Math.abs((yT - yi) / yT * 100);
            iter++;
            System.out.printf("iter=%d      x=%.6f      y=%.6f      ErrorX=%.6f     ErrorY=%.6f\n", iter, xi, yi, toleransX, toleransY);
            if (iter == iMax) {
                durum = false;
            }
            if (toleransX <= errorTolerans && toleransY <= errorTolerans) {
                durum = false;
            }

        }while (durum);

    }
}
