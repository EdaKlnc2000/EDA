public class Letter {
        public static void main(String[] args) {
            char[][] stars = new char[5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j<5; j++) {
                    stars[i][j] = '*';
                }
            }
            stars[0][0] = ' ';
            stars[1][0] = ' ';
            stars[2][0] = '*';
            stars[3][0] = '*';
            stars[4][0] = ' ';
            stars[0][1] = ' ';
            stars[1][1] = '*';
            stars[2][1] = ' ';
            stars[3][1] = ' ';
            stars[4][1] = '*';
            stars[0][2] = '*';
            stars[1][2] = ' ';
            stars[2][2] = ' ';
            stars[3][2] = ' ';
            stars[4][2] = '*';
            stars[0][3] = '*';
            stars[1][3] = ' ';
            stars[2][3] = ' ';
            stars[3][3] = ' ';
            stars[4][3] = '*';
            stars[0][4] = '*';
            stars[1][4] = '*';
            stars[2][4] = ' ';
            stars[3][4] = '*';
            stars[4][4] = '*';

            for (int i = 0; i <5; i++) {
                for (int j = 0; j<5; j++){
                    System.out.print(stars[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


