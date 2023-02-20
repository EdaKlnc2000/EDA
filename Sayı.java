 import java.util.Arrays;
        import java.util.Random;
       import java.util.Scanner ;
 public class Sayı{
       public static void main(String[]args){
        Random Rand =new Random();
        int number = Rand.nextInt( 100 );
        // int sayı = ( int ) (Math.random() * 100 );
           Scanner inp=new Scanner(System.in);
        int right = 0 ;
        int selected;
        int [] sayı=new int[5];
        System.out.println(number);
        boolean isWin = false ;
        boolean isWrong = false ;
        while (right < 5 ) {
        System. out .print("Lütfen tahmininizi giriniz : ");
        selected =inp .nextInt();

        if (selected < 0 || selected > 99 ) {
        System . out .println("Lütfen 0-100 arasında bir değer giriniz.");
        if (isWrong) {
        right++;
        System. out .println("Çok fazla hatalı giriş yapmışsınız. Kalan hak : " + ( 5 -right));
        } else {
        isWrong = true ;
        System . out .println("Bir daha hatalı girişinizde hakkınızdan düşecektir.");
        }
        continue;
        }

        if (selected == number) {
        System. out .println("Tebrikler, doğru tahmin ! Tahmin gördüğünü say : " + number);
        isWin = true ;
        break;
        } else {
        System. out .println("Hatalı bir sayı girdiniz!");
        if (selected > number) {
        System . out .println(selected + " sayısı, gizli sayıların boyutları.");
        }else {
            System.out.println(selected + " sayı, gizli sayıların boyutları.");
        }
         int Wrong=right++;
        System . out .println("Kalan hakkı : " + ( 5 - right));

        }

        }

        if (!isWin) {
        System . out .println("Kaybettiniz ! ");
        if (!isWrong) {
        System . out .println("Tahminleriniz : " + Arrays.toString(new boolean[]{false}));
        }
        }

        }
        }

