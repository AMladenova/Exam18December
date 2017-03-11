import java.util.Scanner;

/**
 * Created by Dr-Br on 27.2.2017 г..
 */
public class Distance {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int initialSpeed = Integer.parseInt(console.nextLine());
        int minutesFirstTime = Integer.parseInt(console.nextLine());
        int minutesSecondTime = Integer.parseInt(console.nextLine());
        int minutesThirdTime = Integer.parseInt(console.nextLine());

        double firstSpeedHours = (double) minutesFirstTime / 60;
        double firstSpeedDistance = initialSpeed * firstSpeedHours;

        double secondSpeed = initialSpeed + (initialSpeed * 0.1);
        double secondSpeedHours = minutesSecondTime / 60.0;
        double secondSpeedDistance = secondSpeedHours * secondSpeed;

        double thirdSpeed = secondSpeed - (secondSpeed * 0.05);
        double thirdSpeedHours = minutesThirdTime / 60.0;
        double thirdSpeedDistance = thirdSpeedHours * thirdSpeed;

        double totalDistance = firstSpeedDistance + secondSpeedDistance + thirdSpeedDistance;

        System.out.printf("%.2f", totalDistance);
    }
}
