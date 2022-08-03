import java.util.Scanner;
public class Ödev10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;
        System.out.println("Dogum tarihini giriniz:");
        year = inp.nextInt();
        System.out.print("Cin zodyak burcunuz:");
        switch(year % 12){
            case 0:{
                System.out.println("Maymun");
                break;
            } case 1:{
                System.out.println("Horoz");
                break;
            } case 2:{
                System.out.println("Köpek");
                break;
            } case 3:{
                System.out.println("Domuz");
                break;
            } case 4:{
                System.out.println("Fare");
                break;
            } case 5:{
                System.out.println("Öküz");
                break;
            } case 6:{
                System.out.println("Kaplan");
                break;
            } case 7:{
                System.out.println("Tavşan");
                break;
            } case 8:{
                System.out.println("Ejderha");
                break;
            } case 9:{
                System.out.println("Yilan");
                break;
            } case 10:{
                System.out.println("At");
                break;
            } default:{
                System.out.println("Koyun");
            }System.out.println("Burcunuz:"+year);
        }

    }
}







