import java.util.Scanner;
public class Ödev {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int n=1,r=1,c;
        System.out.println("1. sayiyi Giriniz:");
        n=scan.nextInt();
        System.out.println("2. Sayiyi Giriniz:");
          r=scan.nextInt();
            c = ((n) / (r) * (n - r));
            for(int i=1;i<=c;i++){
                c=n*r;
            }
            System.out.println("Kombinasyon:"+c);
    }
}

