import java.util.Scanner;
public class Örnek {
    public static void main(String[]args){
        int n;
        Scanner inp=new Scanner(System.in);
        System.out.println("Tamsayi giriniz:");
        n=inp.nextInt();
        if(n>=2 && n<=5){
            System.out.println(" Not Weird");
        }else{
            System.out.println(" wird");
        } if(n>=6 && n<=20){
            System.out.println(" Weird");
        }else{
            if(n>20) {
                System.out.println(" Not Weird");
            }

        }
    }


}
