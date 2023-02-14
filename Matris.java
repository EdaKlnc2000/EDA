import java.util.Scanner;

public class Matris{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matrisin satır sayısını girin: ");
        int rows = input.nextInt();
        System.out.print("Matrisin sütun sayısını girin: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Matrisin elemanlarını girin:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matrisin transpozu:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
