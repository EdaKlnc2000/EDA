import java.util.Scanner;
public class Eda {
    public static void main(String[]args) {
        Scanner inp=new Scanner(System.in);
        int km;
        double perkm=2.20,total;
        System.out.println("Taksimetre km cinsinden giriniz:");
        km=inp.nextInt();
         total=+(km*perkm);
        total=(total<20)?20:total;
        System.out.println("toplam tutar:"+total);

    }
}
