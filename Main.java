import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        int a,b;
        double c,u;
        Scanner inp= new Scanner(System.in);
        System.out.print("1. Kenari Giriniz:");
        a=inp.nextInt();
        System.out.print("2. Kenari Giriniz:");
        b=inp.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs:"+c);
        u=(a+b+c);
         u=Math.sqrt((u*u)+(u*u)+(u*u));
         System.out.print("Alan:"+u);










    }
}
