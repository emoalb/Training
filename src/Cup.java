import java.util.Scanner;

/**
 * Created by Zorak on 9/2/2017.
 */
public class Cup {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
      for (int i=0;i<n/2;i++){
          System.out.printf("%s", repeatStr(".",n+i));
          System.out.printf("%s",  repeatStr("#",3*n-2*i));
          System.out.printf("%s",repeatStr(".",n+i));
          System.out.printf("%n");
      }
for (int i =0 ;i<=n/2;i++) {
    System.out.printf("%s", repeatStr(".",3*n/2+i));
    System.out.printf("%s",  repeatStr("#",1));
    System.out.printf("%s", repeatStr(".",2*n-2*i-2));
    System.out.printf("%s",  repeatStr("#",1));
    System.out.printf("%s", repeatStr(".",3*n/2+i));
    System.out.printf("%n");
}
        System.out.printf("%s",repeatStr(".",2*n));
        System.out.printf("%s", repeatStr("#",n));
        System.out.printf("%s\n", repeatStr(".",2*n));
        for (int i =1;i<=n/2;i++) {
            System.out.printf("%s",repeatStr(".",2*n-2));
            System.out.printf("%s",repeatStr("#",n+4));
            System.out.printf("%s",repeatStr(".",2*n-2));
            System.out.printf("%n");
        }
        System.out.printf("%s",repeatStr(".",(5*n-10)/2));
        System.out.printf("D^A^N^C^E^");
        System.out.printf("%s",repeatStr(".",(5*n-10)/2));
        System.out.printf("%n");
        for (int i =1;i<=(n/2)+1;i++)
        {
            System.out.printf("%s",repeatStr(".",2*n-2));
            System.out.printf("%s",repeatStr("#",n+4));
            System.out.printf("%s",repeatStr(".",2*n-2));
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
