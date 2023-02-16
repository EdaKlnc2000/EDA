import java.util.Arrays;
import java.util.Scanner;
public class Altdizi {
        public static void main(String[] args) {
            int[] dizi = {1, -2, 3, 4, -5, 6, -7, 8, 9};
            int altDiziSayisi = 0;
            int n;
            Scanner inp=new Scanner(System.in);
            System.out.print("Dizinin Alt  Elemanlarını Giriniz:");
            n=inp.nextInt();
            for (int i = 0; i < dizi.length; i++) {
                for (int j = i + 1; j <= dizi.length; j++) {
                    int[] altDizi = Arrays.copyOfRange(dizi, i, j);
                    int toplam = 0;
                    for (int k = 0; k < altDizi.length; k++) {
                        toplam += altDizi[k];
                    }
                    if (toplam < 0) {
                        altDiziSayisi++;
                    }
                }
            }

            System.out.println("Negatif toplama sahip alt dizilerin sayısı: " + altDiziSayisi);
        }
    }


