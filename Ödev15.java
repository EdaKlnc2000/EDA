import java.util.Scanner;
public class Ödev15 {
    public static void main(String[]args){
        int E,K;
        Scanner inp=new Scanner(System.in);
        System.out.print("Üssü  alınacak sayiyi giriniz:");
        E=inp.nextInt();
        System.out.print("Üs olacak sayiyi giriniz:");
        K=inp.nextInt();
        int total=1;
        for(int i=1; i<=K; i++){
            total*=E;
        }
        System.out.println("Cevap:"+total);

    }
}
