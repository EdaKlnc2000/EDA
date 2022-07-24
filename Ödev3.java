import java.util.Scanner;
public class Ödev3 {
    public static void main(String[] args) {
        String username, password;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanici Adiniz:");
        username = inp.nextLine();
        System.out.print("sifreniz:");
        password = inp.nextLine();

        if (username.equals("Eda") && password.equals("Eda.1234")) {
            System.out.println("Giris Basarili");
        }
        else if (username.equals("Eda") != password.equals("Eda.1234")) {
            System.out.println("Giris Başarısız");
        }
        else{
            System.out.println("Lutfen sifrenizi Sifirlayiniz:");
            password= inp.nextLine();
        }

            if(username.equals("Eda")|| password.equals("Eda.1234")){
             System.out.println("Sifre ayni Sifre Olusmadi");
             password= inp.nextLine();
        }
             else if(username.equals("Eda") != password.equals("Eda.12345")){
                System.out.println("Sifre Olustu");
                password= inp.nextLine();
    }
}
}
























