import java.util.Scanner;
public class Ödev {
    public static void main(String[]args){
         Double Boy,Kilo,kitleIndex;

        Scanner inp=new Scanner(System.in);
        System.out.print("Lutfen Boyunuzu Giriniz:");
        Boy=inp.nextDouble();
        System.out.print("Lutfen  Kilonuzu Giriniz:");
        Kilo=inp.nextDouble();
        System.out.println("Boyunuz:"+Boy);
        System.out.println("Kilonuz:"+Kilo);
        Double KitleIndex=Math.sqrt((Kilo)  / (Boy) * (Boy));
        System.out.println("kitleIndex:"+KitleIndex);




    }

}
