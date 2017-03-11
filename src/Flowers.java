import java.util.Scanner;

/**
 * Created by Dr-Br on 27.2.2017 г..
 */
public class Flowers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int chrysanthemumCount = Integer.parseInt(console.nextLine());
        int rosesCount = Integer.parseInt(console.nextLine());
        int tulipsCount = Integer.parseInt(console.nextLine());
        String season = console.nextLine();

        boolean isHoliday = console.nextLine().equals("Y");
        double chrysanthemumPrice;
        double rosesPrice;
        double tulipsPrice;

        if (season.equals("Autumn") || season.equals("Winter")) {
            chrysanthemumPrice = 3.75;
            rosesPrice = 4.50;
            tulipsPrice = 4.15;
        } else {
            chrysanthemumPrice = 2.0;
            rosesPrice = 4.10;
            tulipsPrice = 2.50;
        }

        double totalFlowersCount = chrysanthemumCount + rosesCount + tulipsCount;
        double totalPrice = chrysanthemumPrice * chrysanthemumCount + rosesPrice * rosesCount + tulipsPrice * tulipsCount;


        if (tulipsCount > 7 && season.equals("Spring")) {
            totalPrice *= 0.95;
        } if (rosesCount >= 10 && season.equals("Winter")) {
            totalPrice *= 0.90;
        } if (totalFlowersCount > 20) {
            totalPrice = totalPrice * 0.80;
        }if (isHoliday) {
            totalPrice += totalPrice * 0.15;
           }
        System.out.printf("%.2f", totalPrice + 2.00);
        }
    }

