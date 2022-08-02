import java.util.Scanner;
public class Ödev9 {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int km,yaş, yolculuktip,select;
        double kmbaş=0.10,total;
        System.out.println("Mesafeyi km cinsinden giriniz:");
        km=inp.nextInt();
        System.out.println("Yas giriniz:");
        yaş=inp.nextInt();
        System.out.println("Yolculuk tipini seciniz:");
        yolculuktip=inp.nextInt();
        System.out.println("1-tek yon/n 2-gidis/donus");
        int toplam=(km+yaş+yolculuktip);
        double sonuç=toplam;
        total=+(km*kmbaş);
        System.out.println("Toplam tutar:"+total);
        if(yaş<12){
            System.out.println(" %50 indirim uygula");
        }else if(yaş<=12 && yaş>=24){
            System.out.println(" %10 indirim uygulandı:");
        }else if(yaş>65){
            System.out.println(" %30 indirim uygulandı:");
        }else{
            System.out.print("Hatali veri girdiniz!");
        }


    }

}
