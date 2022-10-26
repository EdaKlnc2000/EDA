import java.util.Scanner;
        public class Ödev28 {
        static int mod(int a, int b){
            return a%b;
        }
        static void calc(int a, int b){
            System.out.println("Alan:"+(a*b));
            System.out.println("Çevresi:"+(2*(a+b)));
        }
        static void Main (String[]args){
            Scanner scan=new Scanner(System.in);
            int select;
            String menu="1-mod alma\n"
                    + "2- Dikdörtgen Alan ve Çevre Hesabı\n"
                    +"3-Çıkış yap";
            while( true){
                System.out.println(menu);
                System.out.println("Bir işllem seçiniz:");
                select=scan.nextInt();
                if(select==0){
                    break;
                }
                System.out.println("ilk sayı:");
                int a=scan.nextInt();
                System.out.println("ikinci sayı:");
                int b=scan.nextInt();
                switch(select){
                    case 1:
                        System.out.println("Mod işlemi:" + mod(a, b));
                        break;

                    case 2:
                        calc(a,b);
                        break;
                    default:
                        System.out.println("Geçersiz bir işlem  girdiniz>");

                }
            }

            System.out.println("Güle güle");
        }
    }


