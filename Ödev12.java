import java. util.Scanner;
public class Ödev12 {
    public static void main(String[]args){
        int k;
        Scanner inp=new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz:");
        k=inp.nextInt();
        for(int i=0;i<=k;i++){
            double avrege=(k);
            if((avrege%3==0)){
                System.out.println("3'e tam bolunen sayilarin ortalmasi");
            }if(avrege%4==0){
                System.out.println("4'e tam bolunen sayilarin ortalmasi");
            }System.out.println("Ortalmaniz:"+avrege);
            System.out.println(i);
        }


    }

}
