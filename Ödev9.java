import java.util.Scanner;
public class Ödev9 {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int km,yaş, yolculuktip;
        double kmbaş=0.10,tutar;
        System.out.println("Mesafeyi km cinsinden giriniz:");
        km=inp.nextInt();
        System.out.println("Yas giriniz:");
        yaş=inp.nextInt();
        System.out.println("Yolculuk tipini seciniz:");
        System.out.println("1-tek yon/n 2-gidis/donus");
        yolculuktip=inp.nextInt();
        tutar=+(km*kmbaş);
        tutar=(km * 0.10);
        tutar=(150*0.10);
        tutar=(tutar*2);
        tutar=(tutar*0.20);
        System.out.println("Toplam tutar:"+km);
        if (yolculuktip==2)
        if(yaş<12){
            System.out.println(" %50 indirim uygula");
        }else if(yaş<=12 && yaş>=24){
            System.out.println(" %10 indirim uygulandı:");
        }else if(yaş>65){
            System.out.println(" %30 indirim uygulandı:");
        }


    }

}
