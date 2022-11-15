public class Main1 {
    public  static void main(String[]args){
        Fighter f1=new Fighter("Marc" , 15 , 100 , 90 , 0);
        Fighter f2=new Fighter("Alex" , 10 , 95 , 100 , 0);
        Match Match=new Match(f1,f2 , 90 , 100);
        Match.run();

    }
}
