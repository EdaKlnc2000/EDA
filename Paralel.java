import java.util.Scanner;
public class Paralel {
public static void main(String[]args) {
	int B=1;
	int H=1;	
if(B>0||H>0) {
	System.out.println("Örnek Giriş:");
	Scanner inp=new Scanner(System.in);
	B=inp.nextInt();
	H=inp.nextInt();
	System.out.println("Örnek Çıktı:");
	int alan=H*B;
	System.out.println(alan);
}
 if(B<=0||H<=0) {
System.out.println("java.lang.Exception: Breadth and height must be positive");
	
}
}
}