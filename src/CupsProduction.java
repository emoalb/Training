import java.util.Scanner;

/**
 * Created by Zorak on 9/2/2017.
 */
public class CupsProduction {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int cupsDemand = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

int cupsProduced = (workers*days*8)/5;
if (cupsProduced>=cupsDemand) {
    double cupsExtramoney= (cupsProduced-cupsDemand)*4.2;
    System.out.printf("%.2f extra money%n",cupsExtramoney);

}else if (cupsProduced<cupsDemand){
    double losses = (cupsDemand-cupsProduced)*4.2;
    System.out.printf("Losses: %.2f%n",losses);
}

    }
}
