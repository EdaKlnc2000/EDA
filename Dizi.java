import java.util.Scanner;
public class Dizi {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int[]Dizi=new int[9];
        int n;
        int neg=0;
        int poz = 0;
        int top=0;
        int  Altdizi=0;
            System.out.println("Dizinin Alt  Elemanlarını Giriniz:");
            n=inp.nextInt();
                for(int i=0;i<Dizi.length;i++) {
                    for (int j = i + 1; j <= Dizi.length; j++){
                        top += Dizi[i];
                    }

                    if (i < neg) {

                        neg = i;
                    }

                    if (i > poz) {
                        Altdizi++;
                    }

                }
                  int toplam=top+Dizi.length;
                    System.out.println();
                  System.out.println("Çıktı:");
                  System.out.println(toplam);

                    }


                    }












