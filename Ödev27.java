import java.util.Scanner;
public class Ödev27 {
    public static void main(String[] args) {
        int  a , b , n ;
        Scanner inp = new Scanner(System.in);
        System.out.print(" A Sayisini Giriniz:");
        a = inp.nextInt();
        System.out.print(" b Sayisini Giriniz:");
        b= inp.nextInt();
        System.out.print(" N Sayisini Giriniz:");
        n = inp.nextInt();
        System.out.println(a + " + ");

        int toplam = a + b;
        a = b;
        b = toplam;
        System.out.println(a + " * ");

        int çarpim = a * b;
        a = b;
        b = çarpim;
        System.out.println(a+b);
        System.out.println(a*b);

    }
}

