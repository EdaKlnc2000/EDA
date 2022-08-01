import java.util.Scanner;
public class Ödev8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int day, month;
        String burc = "";
        System.out.println("Ay Giriniz:");
        month = inp.nextInt();
        System.out.println("Gun Giriniz:");
        day = inp.nextInt();
        if (day >= 1 && day <= 31) {
            if (day < 22) {
                burc = "Oğlak";
            } else {
                burc = "Kova";
            }if (day >= 1 && day <= 28) {
                if (day <= 20) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }if (day >= 1 && day <= 31) {
                    if (day <= 21) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }if(day>=1 && day<=31){
                        if(day<=23){
                            burc="Aslan";
                        }else{
                            burc="Boga";
                        }System.out.println("Burcunuz:"+burc);
                    }
                }
            }
        }
    }
}


