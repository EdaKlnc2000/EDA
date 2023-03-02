import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class MayınTarlası {
    public static void main(String[] args) {
        Mayın();

    }

    public static void Mayın() {
        System.out.println("===========");
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz");
        Scanner inp = new Scanner(System.in);
        int sayac = 0;
        System.out.print("Satır Giriniz:");
        int Row = inp.nextInt();
        System.out.print("Sütun Giriniz:");
        int Col = inp.nextInt();
        char[][] MayınTarlası1 = new char[Row][Col];
                    if (sayac == Row * Col - (Row * Col / 4)) {
                        if ((Row < 0 || Col > (Row - 1)) || (Row < 0 || Row > (Col - 1))) {
                            System.out.println("Oyunu Kaybettiniz!");
                        }
                    }
                        char[][] mayın = new char[Col][Row];
                        char[][] mayın2 = new char[Col][Row];
                        for (int t = 0; t < mayın.length; t++) {
                            for (int y = 0; y < mayın[t].length; y++) {
                                mayın[t][y] = '-';
                            }
                            for (int o = 0; o < mayın2.length; o++) {
                                for (int ü = 0; ü < mayın2[o].length; ü++) {
                                    mayın2[o][ü] = '-';
                                }
                            }

                            Random rand = new Random();
                            int rand1;
                            int rand2;
                            for (int f = 0; f < Col; f++) {
                                rand1 = rand.nextInt(Col);
                                rand2 = rand.nextInt(Row);
                                if (mayın[rand1][rand2] == '*') {
                                    f--;
                                    continue;
                                } else {
                                    mayın[rand1][rand2] = '*';
                                }
                            for (int n = 0; n < mayın2.length; n++) {
                                for (int m = 0; m < mayın2[n].length; m++) {
                                    System.out.println(mayın2[n][m]);
                                }
                            }

                        }
                        System.out.print("Satır Giriniz:");
                        int row = inp.nextInt();
                        System.out.print("Sütun Giriniz:");
                        int col = inp.nextInt();
                        char[][] MayınTarlası2 = new char[row][col];
                        for (int a = 0; a < row; a++) {
                            for (int b = 0; b < col; b++) {
                                    if ((row + a>= 0 && (row + a) <= (row +1)) && (col + b >= 0 && (col + b) <= (col + 1))) {
                                        System.out.println("Oyunun Kazandınız!");
                                    }
                                }

                            }


                        }

                    }

                }





