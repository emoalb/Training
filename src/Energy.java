import java.util.Scanner;

/**
 * Created by Zorak on 9/2/2017.
 */
public class Energy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int dancers = Integer.parseInt(scanner.nextLine());

        int[] hours = new int[days+1];
        int energy = 100*days*dancers;
int wastedEnergy=0;

        for (int i=1;i<=days;i++) {
            hours[i]= Integer.parseInt(scanner.nextLine());
        }
for (int i=1;i<=days;i++) {
     if(i%2!=0&&hours[i]%2!=0) {
         wastedEnergy=wastedEnergy+ dancers*30;
     }else if (i%2==0&&hours[i]%2!=0){
         wastedEnergy=wastedEnergy+ dancers*65;
     }else if (i%2==0&&hours[i]%2==0){
         wastedEnergy=wastedEnergy+ dancers*68;
     }else if (i%2!=0&&hours[i]%2==0){
         wastedEnergy=wastedEnergy+ dancers*49;
     }
}
int unwastedE= energy-wastedEnergy;

double percentE = ((double)wastedEnergy/energy)*100;
double energyLeft = (double)(unwastedE/dancers)/days;
        if(percentE<50) {
            System.out.printf("They feel good! Energy left: %.2f",energyLeft );

        }else if (percentE>=50) {
            System.out.printf("They are wasted! Energy left: %.2f",energyLeft);
        }
    }
}
