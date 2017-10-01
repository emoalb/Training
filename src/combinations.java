import java.util.Scanner;

/**
 * Created by Zorak on 9/2/2017.
 */
public class combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int currentComb=1;
        boolean isFound = false;
        int possibleCombinations = (firstNumber-secondNumber +1)*(firstNumber-secondNumber +1);

        for (int i=firstNumber;i>=secondNumber;i--) {

            for (int a=firstNumber;a>=secondNumber;a--){
               // System.out.printf("%d, %d\n",i, a);
                if(((a+i)==magicNumber)&&isFound==false){
                    System.out.printf("Combination N:%d ", currentComb);
                    System.out.printf("(%d + %d = %d)\n", i, a, magicNumber);
                    isFound=true;
                }
                currentComb++;
            }
        }
        if (isFound==false) {
            System.out.printf("%d combinations - neither equals %d", possibleCombinations, magicNumber);


        }
    }
}
