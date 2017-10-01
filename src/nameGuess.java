import java.util.Scanner;

/**
 * Created by Zorak on 9/2/2017.
 */
public class nameGuess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char capL = console.nextLine().charAt(0);
        char snd = console.nextLine().charAt(0);
        char trd = console.nextLine().charAt(0);
        char frt = console.nextLine().charAt(0);
        int i = Integer.parseInt(console.nextLine());
        int combinations =0;

for (char index1='A';index1<=capL;index1++) {
    for (char index2 = 'a';index2<=snd;index2++) {
        for (char index3 = 'a';index3<=trd;index3++){
            for (char index4 = 'a';index4<=frt;index4++) {
                for (int index5 = 0 ; index5<=i;index5++) {
                 ++combinations;

                }
            }
        }
    }
}
        System.out.printf("%d\n",combinations-1);
    }
}
