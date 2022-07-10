import java.util.Scanner;
public class Ödev {
    public static void main(String[]args){
         Double Boy,Kilo,VucutkitleIndex;

        Scanner inp=new Scanner(System.in);
        System.out.print("Lutfen Boyunuzu Giriniz:");
        Boy=inp.nextDouble();
        System.out.print("Lutfen  Kilonuzu Giriniz:");
        Kilo=inp.nextDouble();
        Double vucutKitleIndex=Kilo/(Boy * Boy);
        System.out.println("vucutkitleIndex:"+vucutKitleIndex);




    }

}
