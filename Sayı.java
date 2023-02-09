import java.util.Arrays;
public class Sayı {
    public static void main(String[] args) {
        int[] sayi = {4, 2, 4, 5, 2, 3, 1};
        int[] duplicate = new int[sayi.length];
        for (int i = 0; i < sayi.length; i++) {
            for(int a:duplicate){
                if(i!=0){
                    if(i%2==0){
                        System.out.println("Tekrar Eden Çift Sayı: " +sayi[i]);
                    }

                }
            }


        }
    }

}
