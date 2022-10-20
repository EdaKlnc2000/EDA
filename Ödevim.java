import java.util.Scanner;
public class Ödevim {
    static boolean Ispalindrom(int number){
        int temp=number, reverseNumbeer=0,LastNumber;
        while(temp!=0){
            LastNumber=temp%10;
            reverseNumbeer=(reverseNumbeer*10)+LastNumber;
            temp/=10;
        }
        if(number==reverseNumbeer)
            return true;
        else
            return false;
    }
    public static void main(String[]args){
        System.out.println(Ispalindrom(569));
    }


}
