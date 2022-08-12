import java.util.Scanner;
public class Ödev14 {
    public static void main(String[] args) {
        int E;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        E = inp.nextInt();
        for (int i = 1; i <=E; i *= 4) {
            System.out.println(i);
        }
            for (int j = 1; j <=E; j *= 5){
                System.out.println(j);
        }
    }
}

