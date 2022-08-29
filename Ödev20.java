import java.util.Scanner;
public class Ödev20 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int N1, N2, ebob = 1,ekok=1;
        System.out.println("N1 Sayisini Giriniz:");
        N1 = inp.nextInt();
        System.out.println("N2 Sayisini Giriniz:");
        N2 = inp.nextInt();
        int i=1;
        while(i<=N1){
            i++;
            if(N1%i==0&&N2%i==0){
                ebob=i;

            }
        }
        int k=1;
        while(i<=N1){
            i++;
            if(N1%k==0&&N2%k==0){
                System.out.println(k);
                System.out.println(i);
                ekok=k;

            }
        }
        System.out.println((N1*N2)/ebob);



    }
}

