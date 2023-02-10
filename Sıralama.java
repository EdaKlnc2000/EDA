
import java.util.Arrays;
import java.util.Scanner;

public class Sıralama {
    static boolean Isfind(int[] arr,int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[]args) {
        Scanner inp = new Scanner(System.in);
                int size,a;
                System.out.print("Dizini boyutu n:");
                size= inp.nextInt();
             int[] arry= new int[size];
             System.out.println("Dizini elamanlarını giriniz:");
        for (int i = 0; i <size; i++) {
           System.out.print(i + "Elamani:");
                    arry[i] = inp.nextInt();
                }
                 for (int i = 0; i <size-1; i++) {
                     for (int j = 0; j < size -i- 1; i++) {
                         if (arry[j] > arry[j + 1]) {
                             int temp = arry[j];
                             arry[j] = arry[j + 1];
                             arry[j + 1] = temp;

                         }
                     }
                 }
                    System.out.println("Sıralama:");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arry[i] + " ");
                    }
                    System.out.println();
                }
    }












