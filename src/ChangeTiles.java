import java.util.Scanner;

/**
 * Created by Dr-Br on 27.2.2017 г..
 */
public class ChangeTiles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double budget = Double.parseDouble(console.nextLine());

        double floorWidth = Double.parseDouble(console.nextLine());
        double floorLenght = Double.parseDouble(console.nextLine());

        double tileSide = Double.parseDouble(console.nextLine());
        double tileHight = Double.parseDouble(console.nextLine());

        double singleTilePrice = Double.parseDouble(console.nextLine());
        double wageContractor= Double.parseDouble(console.nextLine());

        double floorArea = (floorWidth * floorLenght);
        double tileArea = (tileHight * tileSide) / 2;

        final int wastage = 5;
        int tileCount = (int)(Math.ceil(floorArea / tileArea) + wastage);
        double tilePrice = tileCount * singleTilePrice;
        double totalPrice = tilePrice + wageContractor;

        if(totalPrice <= budget){
            System.out.printf("%.2f lv left.", Math.abs(totalPrice - budget));
        }else{
            System.out.printf("You'll need %.2f lv more.",Math.abs(totalPrice - budget) );
        }
    }
}
