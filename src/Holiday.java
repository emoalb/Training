import java.util.Scanner;

/**
 * Created by Zorak on 9/2/2017.
 */
public class Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        if (budget >= 10 && budget <= 100) {
            if (season.equals("summer")) {
                System.out.printf("Somewhere in Bulgaria\n");
                System.out.printf("Camp - %.2f\n", 0.3 * budget);
            }
            if (season.equals("winter")) {
                System.out.printf("Somewhere in Bulgaria\n");
                System.out.printf("Hotel - %.2f\n", 0.7 * budget);
            }
        } else if (budget <= 1000 && budget > 100) {
            if (season.equals("summer")) {
                System.out.printf("Somewhere in Balkans\n");
                System.out.printf("Camp - %.2f\n", 0.4 * budget);
            }
            if (season.equals("winter")) {
                System.out.printf("Somewhere in Balkans\n");
                System.out.printf("Hotel - %.2f\n", 0.8 * budget);
            }
        } else if (budget >= 1000) {

            System.out.printf("Somewhere in Europe\n");
            System.out.printf("Hotel - %.2f\n", 0.9 * budget);


        }
    }
}
