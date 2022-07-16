import java.util.Scanner;
public class Ödev2 {
    public static void main(String[]args){
        int sayi1,sayi2,islem;
        Scanner inp=new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz:");
        sayi1= inp.nextInt();
        System.out.print("ikinci Sayiyi Giriniz:");
        sayi2=inp.nextInt();
        System.out.println("1-toplama\n2-cikarma\n3-carpma\n4bolme");
        System.out.print("islemi seciniz:");
        islem=inp.nextInt();
        switch (islem){
            case 1: {
                System.out.println("toplam:" + (sayi1 + sayi2));
                break;
            }
            case 2: {
                System.out.println("çıkarma:" + (sayi1 - sayi2));
                break;
            }
            case 3: {
                System.out.println("çarpma:" + (sayi1 * sayi2));
                break;
            }
            case 4: {
                if (sayi2 != 0) {
                    System.out.println("bölme:" + (sayi1 / sayi2));
                    break;
                }
                else{
                    System.out.println("bu sayı o'a bölünmez:");
                        Default:
                        System.out.println("yanlış seçim yaptınız tekrar deneyiniz:");

                    }



                }


            }



        }


    }



