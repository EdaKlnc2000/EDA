import java.util.Scanner;
public class Oyun {
    public static boolean canWin(int sicrama, int[] oyun, int i) {
        int N = oyun.length;
        if (i < 0 || oyun[i] == 1) {
            return false;
        }
        if (i == N - 1 || i + sicrama >= N) {
            oyun[i] = 1;
             canWin( sicrama ,  oyun ,  i + 1);
            canWin( sicrama ,  oyun ,  i - 1);
            canWin(sicrama, oyun, i + sicrama);

        }
            return true;
        }


public  static  void  main ( String [ ]  args )  {
            Scanner inp=new Scanner( System.in ) ;
            int q =inp.nextInt ();
            while ( q -- > 0 ) {
                int n = inp. nextInt (); int sicrama =inp . nextInt ();

                int []  oyun  =new  int [ n ];
                for  ( int  i  =  0 ;  i  <  n ;  i++) {
                    oyun[i] = inp.nextInt();
                }

                System.out.println (  ( canWin ( sicrama,  oyun ,  0 ))  ?  "EVET"  :  "HAYIR"  );
            }
        }
    }