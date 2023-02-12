import java.util.Arrays;
import java.util.Scanner;
public class Frekans {
    public static void main(String[]args){
        int[]list={10, 20, 20, 10, 10, 20, 5, 20};
        int hesapla;
        System.out.println("Dizi:"+Arrays.toString(list));
        System.out.println("Tekrar Sayıları");
        Arrays.sort(list);
        for(int i=0;i<list.length;i++){
            hesapla=0;
            for(int j=0;j<list.length;j++){
                if(list [i]==list[j])
                hesapla++;
            }
            if(i==0 && list[i]==list[i+1]) {
                System.out.println(list[i] + " Sayısı " + hesapla  +  " Kere Tekrar edilidi ");
            }
                if(i==0 && list[i]!=list[i+1]) {
                    System.out.println(list[i] + " Sayısı " + hesapla  +  " Kere Tekrar edildi ");
                }
                    if(i!=0 && list[i]!=list[i-1]){
                        System.out.println(list[i] + " Sayısı " + hesapla  +  " Kere Tekrar edildi ");

                    }

                }
            }
        }








                   




