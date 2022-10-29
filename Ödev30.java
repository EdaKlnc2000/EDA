
import java.util.Scanner;

public class Ödev30 {
    static int asal(int a) {
        return a;

    }

        public static void main (String[]args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Sayi gir:");
            int a = scan.nextInt();
            int i = 0;
            for (i = 2; i <= a; i++) {
                if (i % a == 0) {
                    i++;
                }

            }
            if (i % a == 0) {
                System.out.println(asal(a) + " Sayısı Asaldır!");
            } else {
                System.out.println(asal(a) + "Sayısı Asal değildir!");
            }


        }

    }





