import java.util.Scanner;
public class Ödev {
    public static void main(String[]args){
        int kilonuz=105;
        double boyunuz=1.72;
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu giriniz:");
        boyunuz=inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kilonuz=inp.nextInt();
        System.out.println("boyunuz:"+boyunuz);
        System.out.println("kilonuz:"+kilonuz);


    }

}
