
public class Add extends Adder {

	Add(int a, int b) {
		super(a, b);
		
	}
	public static void main(String[]args) {
		
	Add a=new Add(42,13);
		System.out.println("My superclass is:Arithmetic ");	
		System.out.print(a(10,32) + " " +a(10,3) + " " +a(10,10) + "\n");
		
		
		
	}
	private static int a(int a, int b) {
		
		return a+b;
	}

}
