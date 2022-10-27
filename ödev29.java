import java.util.Scanner;
public class ödev29 {
    static int power(int a, int b){
        int result=1;
        for(int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Taban gir:");
        int a=scan.nextInt();
        System.out.print("üs gir:");
        int b=scan.nextInt();
        System.out.println("Sonuc:"+ power(a,b));

    }
    }

