public class Harmonik {
    public static void main(String[]args) {
        int[] sayi = {1, 2, 3, 4, 5};
        double harmonik = 0.0;
        for (int i = 0; i < sayi.length; i++) {
            harmonik += (1.0 / (i + 1));
        }
        System.out.println("Harmonik ortlama:" + (sayi.length / harmonik));

    }
}
