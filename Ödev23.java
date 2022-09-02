import java.util.Scanner;
public class Ödev23 {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int n;
        System.out.print("Basmak Sayisini Giriniz:");
        n=inp.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=(n-i);k++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
