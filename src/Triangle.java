import java.util.Scanner;

/**
 * Created by Zorak on 9/2/2017.
 */
public class Triangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 1; i <= (4 * n + 1); i++) {
            System.out.printf("#");
        }
        System.out.printf("\n");
        for (int i = 1; i <= (n); i++) {
            for (int a = 1; a <= i; a++) {
                System.out.printf(".");
            }
            for (int a = 1; a <= 2 * n - 2 * i + 1; a++) {
                System.out.printf("#");
            }

            for (int a = 1; a <= 2 * i - 1; a++) {
                System.out.printf(" ");
            }

            for (int a = 1; a <= 2 * n - 2 * i + 1; a++) {
                System.out.printf("#");
            }
            for (int a = 1; a <= i; a++) {
                System.out.printf(".");
            }
            System.out.printf("%n");
        }
        for (int i = 1; i <= n; i++) {
            for (int a=1;a<=n+i;a++){
                System.out.printf(".");
            }
            for (int a = 2*n+5;a>=i;a=a-2) {
                System.out.printf("#");
            }
            for (int a=1;a<=n+i;a++){
                System.out.printf(".");
            }
            System.out.printf("\n");
        }


    }
}
