import java.util.Scanner;

/**
 * Created by Zorak on 9/2/2017.
 */
public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        final int ROW = ((2 * n - 1))/2-1;
        final int COL = (2 * n - 2)/2-1;
        final int MID = (2 * n - 2)/2;
        for (int a = 1; a <= COL ; a++) {
            for (int i = 0; i <ROW ; i++) {
               if(a%2!=0) {
                   System.out.print("*");
               }else {
                   System.out.print("-");
               }
            }
            System.out.print("\\ /");
            for (int i = 0; i < ROW; i++) {
                if(a%2!=0) {
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }
            }
            System.out.printf("%n");
        }
for (int i =0;i<MID;i++){
            System.out.print(" ");

}
        System.out.print("@");
        for (int i =0;i<MID;i++){
            System.out.print(" ");

        }
        System.out.printf("%n");
        for (int a = 1; a <= COL ; a++) {
            for (int i = 0; i <ROW ; i++) {
                if(a%2!=0) {
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }
            }
            System.out.print("/ \\");
            for (int i = 0; i < ROW; i++) {
                if(a%2!=0) {
                    System.out.print("*");
                }else {
                    System.out.print("-");
                }
            }
            System.out.printf("%n");
        }
    }
}
