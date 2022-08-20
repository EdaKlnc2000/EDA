import java.util.Scanner;
public class Ödev16 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, toplam = 0;
        System.out.print("Sayi Giriniz :");
        a=inp.nextInt();
        while (a != 0) {
            toplam+=a%10;
            a = a/10;
        }System.out.println("basamak toplami:"+toplam);

        }

        }



