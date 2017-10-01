import java.util.Scanner;

/**
 * Created by Zorak on 9/2/2017.
 */
public class weedShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
       double gemusePreis = Double.parseDouble(scanner.nextLine());
       double obstPreis = Double.parseDouble(scanner.nextLine());
       int gemusKilo = Integer.parseInt(scanner.nextLine());
       int obstKilo = Integer.parseInt(scanner.nextLine());
       double revenue = gemusePreis*gemusKilo+obstPreis*obstKilo;
        System.out.printf("%f\n",revenue/1.94);
    }
}
