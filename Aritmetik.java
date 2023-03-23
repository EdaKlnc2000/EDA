 class Aritmetik {
	     int x;
	     int y;

	     public int Add(int x, int y) {
	         this.x = x;
	         this.y = y;
	         return (x + y);
	     }

	     private static int a(int a, int b) {

	         return a + b;
	     }

	     public static void main(String[] args) {
	         Aritmetik a = new Aritmetik();
	         System.out.println("My superclass is:Arithmetic ");
	         System.out.print(a(10, 32) + " " + a(10, 3) + " " + a(10, 10) + "\n");
	     }
	 }

