import java.util.Scanner;
public class Ödev13 {
    public static void main(String[]args){
        int E;
       int total=0;
       Scanner scan=new Scanner(System.in);
       do {
           System.out.print("Sayı Giriniz:");
           E = scan.nextInt();
           if (E % 2 == 0) {
             total+=E;
             if(E%4==0){
                 System.out.println(E + " sayısı 4'ün katıdır.");
             }
           }
       }while(E>0);
       System.out.println("Toplam:"+total);

    }
}
