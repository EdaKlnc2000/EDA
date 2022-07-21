import java.util.Scanner;
public class Ödev4 {
    public static void main(String[]args){
        int mat,fizik,kimya,türkce,muzik;
        Scanner inp=new Scanner(System.in);
        System.out.println("Matematik Notunuz:");
        mat=inp.nextInt();
        System.out.println("Fizik Notunuz:");
        fizik=inp.nextInt();
        System.out.println("Kimya Notunuz:");
        kimya=inp.nextInt();
        System.out.println("Turkce Notunuz:");
        türkce=inp.nextInt();
        System.out.println("Muzik Notunuz:");
        muzik=inp.nextInt();
        double avrage=(mat+fizik+kimya+türkce+muzik)/5;
        if(avrage<=0||avrage>=100){
            System.out.println("ortalmaniz 0 ve 100 arasina dahil ortalmaya katilabilirsiniz");

        }
        else{
            System.out.println("ortalmaniz 0 ve 100 değil ortalmaya katilamazsiniz");

        }System.out.print("ortalamaniz"+avrage);



        }


    }






