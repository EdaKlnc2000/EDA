

import java.util.Scanner;

public class Ödev21 {

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int N,max=0,min=0;
        System.out.println("Sayi Giriniz:");
        N=inp.nextInt();


        for (int i=1; i<=N; i++)
        {

            System.out.println(i+". sayiyi giriniz: ");
            N = inp.nextInt();
            if (i==1)
            {
                max=N;
                min=N;
            }

            if (N>max)
                max=N;

            if (N<min)
                min=N;
        }

        System.out.println(" En Buyuk Sayi: "+max);
        System.out.println(" En Kucuk Sayi: "+min);
    }

}



