 import java.util.Scanner;
public class Ödev22 {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int E;
       System.out.print("Sayi Girinz:");
       E=inp.nextInt();
       if(E%2==0){
           System.out.println("Mukemmel sayidir");
       }else{
           System.out.println("Mukemmel sayi degildir");
       }

    }

}
