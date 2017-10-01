import java.util.Scanner;

/**
 * Created by Zorak on 9/2/2017.
 */
public class newTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String hash = "#";
        String dot = ".";
        String space = " ";

        int n = Integer.parseInt(scanner.nextLine());

        System.out.printf("%s\n",  repeatStr(hash,4*n+1));
for (int i =1; i<=n;i++) {

    System.out.printf("%s",  repeatStr(dot,i));
    System.out.printf("%s",   repeatStr(hash,2*n-2*i+1));
    System.out.printf("%s",   repeatStr(space, i+1));
    System.out.printf("%s",   repeatStr(hash,2*n-2*i+1));
    System.out.printf("%s",  repeatStr(dot,i));
    System.out.printf("\n");
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
