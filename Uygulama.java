public class Uygulama {
    static  void helloworld(){
        System.out.println("Merhaba Dunya");
    }
    static int power(int base,int exp){
        int result=1;
        for(int i=1;i<=exp;i++){
            result*=base;

        }
        return result;
    }
    public static void main(String[]args){
        int base,exp;
        System.out.println(power(2,3));
        System.out.println(power(5,3));
        helloworld();

    }
}

