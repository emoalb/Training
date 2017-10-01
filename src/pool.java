import java.util.Scanner;

/**
 * Created by Zorak on 9/1/2017.
 */
public class pool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double poolVolume = Double.parseDouble(scanner.nextLine());
        double pipeOne = Double.parseDouble(scanner.nextLine());
        double pipeTwo  =Double.parseDouble(scanner.nextLine());
        double hoursWorker = Double.parseDouble(scanner.nextLine());

        double volumeOne = pipeOne*hoursWorker;
        double volumeTwo = pipeTwo*hoursWorker;


double volumeAll =volumeOne+volumeTwo;

if (volumeAll>poolVolume) {
    System.out.printf("For %.1f hours the pool overflows with %.1f liters.\n",hoursWorker,(volumeAll-poolVolume));
}else if (volumeAll<=poolVolume) {
    double volumePer = (volumeAll/ poolVolume)*100;
    double percentOne  = (volumeOne/ volumeAll)*100;
    double percentTwo = (volumeTwo/ volumeAll)*100;
    System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.\n",(int) volumePer,(int) percentOne,(int) percentTwo);
}
    }

}
