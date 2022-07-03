import java.util.Scanner;
public class Main {
    public static void main(String[]args) {
        double tutar,kdvoran=0.18,kdvtutar,kdvlitutar,kdvsiztutar;
                Scanner inp=new Scanner(System.in);
        System.out.println("KDV Tutar Giriniz:");
          tutar=inp.nextDouble();
          kdvtutar=tutar*kdvoran;
          kdvlitutar=tutar+kdvtutar;
         System.out.println("KDV'siz tutar:"+tutar);
        System.out.println("KDVoran:"+kdvtutar);
        System.out.println("KDV'li tutar:"+tutar);
        boolean kosul1=((tutar>=1000));
        System.out.println("Durum"+(kosul1?"Büyük":"DEĞİL"));







    }
}
