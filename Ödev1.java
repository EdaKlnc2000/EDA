import java.util.Scanner;
public class Ödev1 {
    public static void main(String[]args) {
        double elma,armut,muz,patlıcan,domates;
        Scanner inp=new Scanner(System.in);
        System.out.print("Elma kac kilo:");
        elma=inp.nextDouble();
        System.out.print("Armut kac kilo:");
        armut=inp.nextDouble();
        System.out.print("muz kac kilo:");
        muz=inp.nextDouble();
        System.out.print("domates kac kilo:");
        domates=inp.nextDouble();
        System.out.print("Patlican kac kilo:");
        patlıcan=inp.nextDouble();
        double toplam=(elma+armut+muz+domates+patlıcan);
        double sonuc=toplam;
        System.out.println("Toplam tutar:"+sonuc);



    }
}
