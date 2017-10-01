import java.util.Scanner;

/**
 * Created by Zorak on 9/2/2017.
 */
public class CrismasHat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= 2; i++) {
            System.out.printf("%s", repeatStr(".", 2 * n +-1));
            if (i == 1) {
                System.out.printf("/");
            } else if (i == 2) {
                System.out.printf("\\");
            }
            System.out.printf("|");
            if (i == 1) {
                System.out.printf("\\");
            } else if (i == 2) {
                System.out.printf("/");

            }
            System.out.printf("%s", repeatStr(".", 2 * n -1));
            System.out.printf("%n");
        }
        for (int i=0;i<2*n;i++) {
            System.out.printf("%s", repeatStr(".", 2 * n - 1-i));
            System.out.printf("*");
            System.out.printf("%s", repeatStr("-", i));
            System.out.printf("*");
            System.out.printf("%s", repeatStr("-", i));
            System.out.printf("*");
            System.out.printf("%s", repeatStr(".", 2 * n - 1-i));
            System.out.printf("%n");
        }
        System.out.printf("%s", repeatStr("*",4*n+1));
        System.out.printf("%n");
        System.out.printf("%s", repeatStr("*.",2*n));
        System.out.printf("*");
        System.out.printf("%n");
        System.out.printf("%s", repeatStr("*",4*n+1));
    }
    public static String repeatStr(String str ,int count){

        StringBuilder sb = new StringBuilder();


        for (int i=0;i<count;i++){
            sb.append(str);
        }
        return sb.toString() ;

    }
}
