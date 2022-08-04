import java.util.Scanner;
public class Ödev11 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int yil=2018;
        System.out.println("Yil Giriniz:");
        yil = inp.nextInt();{
            if(yil % 4==0){
                System.out.println("Artik yil");
            }else{
                System.out.println("Artik yil degil");
            }


        }
    }
}

