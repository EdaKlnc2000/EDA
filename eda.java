
import java.util.Scanner;

public class eda {
    public static void main(String[] args) {
        double a, c, r, π;
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin alanını giriniz:");
        a = inp.nextDouble();
        System.out.print("Dairenin çevresini giriniz:");
        c = inp.nextDouble();
        System.out.print("yariçapi giriniz:");
        r = inp.nextDouble();
        a = Math.sqrt(π * (r) * (r));
        c = Math.sqrt(2 * π * r);
        r = Math.sqrt((π * (r * r) * (a) / 360));
    }
}
