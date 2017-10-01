import java.util.Scanner;

/**
 * Created by Zorak on 9/2/2017.
 */
public class hourGlass
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i =0;i<(2*n+1);i++) {
            System.out.printf("*");
        }
        System.out.printf("\n");
        for (int i = 1; i<=n-1;i++) {
            for (int a=1;a<=i;++a) {
                System.out.printf(".");
            }
            System.out.printf("*");
            for (int a=1;a<=(2*n-1-2*i);a++) {
                if (i==1) {
                    System.out.printf(" ");
                }else System.out.printf("@");
            }
            System.out.printf("*");
            for (int a=1;a<=i;++a) {
                System.out.printf(".");
            }
            System.out.printf("\n");
        }
        for (int i=1;i<=n;i++) {
            System.out.printf(".");
        }
        System.out.printf("*");
        for (int i=1;i<=n;i++) {
            System.out.printf(".");
        }
        System.out.printf("\n");


        for (int i = n-1; i>=1;i--) {
            for (int a=1;a<=i;++a) {
                System.out.printf(".");
            }
            System.out.printf("*");
for (int a=0;a<=n-i-2;a++){
    if (i==1) {
        System.out.printf("@");
    }else if (i>1){
        System.out.printf(" ");
    }
}
            System.out.printf("@");

            for (int a=0;a<=n-i-2;a++){
                if (i==1) {
                    System.out.printf("@");
                }else if (i>1){
                    System.out.printf(" ");
                }
            }


            System.out.printf("*");
            for (int a=1;a<=i;++a) {
                System.out.printf(".");
            }

            System.out.printf("\n");
        }

        for (int i =0;i<(2*n+1);i++) {
            System.out.printf("*");
        }
    }
}
