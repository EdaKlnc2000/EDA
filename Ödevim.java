import java.util.Scanner;
public class Ödevim {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String userName, password;
        int right = 3, balance = 3500, price, select;
        while (right > 0) {
            System.out.print("Kullanici adi:");
            userName = inp.nextLine();
            System.out.print("Sifre:");
            password = inp.nextLine();
            if (userName.equals("Eda") && password.equals("Eda.2000")) {
                System.out.println("Merhaba Eda Bankasina Hosgeldiniz");
                System.out.println("1-Para Yatirma /n"+
                        "2-Para çekme /n+" +
                        " 3-Bakiye sorgula /n+" +
                        " 4-Çıkış yap");

                System.out.println("Yapmak istediginiz islemi seciniz:");
                select = inp.nextInt();
                switch (right) {
                    case 1: {
                        System.out.println("Para miktarı");
                        price = inp.nextInt();
                        balance += price;
                        break;
                    }
                    case 2: {
                        System.out.println("Para miktarı");
                        price = inp.nextInt();
                        balance -= price;
                        break;
                    }
                    case 3: {
                        System.out.println("Bakiyeniz:" + balance);
                    }
                    case 4: {
                        System.out.println("Tekrar görüşmek üzere");
                        break;
                    }
                    case 0: { System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz");
                        right--;
                        System.out.println("Hatali kullanici adi veya sifre tekrar deneyiniz");
                        break;
                    } default:{
                        System.out.println("Kalan hakkınız." + right);
                    }


                }
            }
        }
    }
}


