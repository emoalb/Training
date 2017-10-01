import java.util.Scanner;

/**
 * Created by Zorak on 9/2/2017.
 */
public class Fox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
int n =Integer.parseInt(scanner.nextLine());
        for (int i=1;i<=n;i++){
            System.out.printf("%s",  repeatStr("*",i));
            System.out.printf("\\");
            System.out.printf("%s",  repeatStr("-",2*n-2*i+1));
            System.out.printf("/");
            System.out.printf("%s",  repeatStr("*",i));
            System.out.printf("%n");

}
        for (int i=1;i<=n/3;i++){
            System.out.printf("|");
            System.out.printf("%s",  repeatStr("*",(n-1)/2+i-1));
            System.out.printf("\\");
            System.out.printf("%s",  repeatStr("*",n+2-2*i));

            System.out.printf("/");
            System.out.printf("%s",  repeatStr("*",(n-1)/2+i-1));
            System.out.printf("|");
            System.out.printf("%n");

        }
        for (int i=1;i<=n;i++){
            System.out.printf("%s",  repeatStr("-",i));
            System.out.printf("\\");
            System.out.printf("%s",  repeatStr("*",2*n-2*i+1));
            System.out.printf("/");
            System.out.printf("%s",  repeatStr("-",i));
            System.out.printf("%n");

        }
    }

    public static String repeatStr(String str ,int count){

        StringBuilder sb = new StringBuilder();


        for (int i=0;i<count;i++){
            sb.append(str);
        }
        return sb.toString() ;

    }
}
