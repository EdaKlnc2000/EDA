
import java.util.Arrays;
import java.util.Scanner;
public class Ödevimm {
    public static void main(String[]args){
        int [] Eda={15,12,788,1,-1,-788,2,0};
        int sayı;
        int min=Eda[0];
        int max=Eda[1];
        Arrays.sort( Eda );
        Scanner inp=new Scanner(System.in);
        System.out.print("Girilen Sayı:");
        sayı=inp.nextInt();
        for(int i=0;i<Eda.length;i++) {

            if (Eda[i] < sayı) {
                min = Eda[i];

                if (Eda[i] > sayı) {
                    max = Eda[i];
                }
            }

        }
        System.out.println("Girilen sayısının küçük en yakın sayı: "+min);
        System.out.println("Girilen sayısının Büyük en yakın sayı: "+max);

    }

}
