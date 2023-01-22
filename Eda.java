public class Eda {
    public static void recursiveMethod(int num) {
        if (num <= 0) {
            num += 5;
            System.out.println("New value: " + num);
            recursiveMethod(num);
        } else {
            num -= 5;
            System.out.println("New value: " + num);
            recursiveMethod(num);
        }
            int num = 25;
            recursiveMethod(num);

        }
    }




