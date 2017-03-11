import java.util.Scanner;

/**
 * Created by Dr-Br on 27.2.2017 г..
 */
public class ChristmasHat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int dotCount = 2 * n - 1;
        String dots = repeatString(".", dotCount);
        System.out.printf("%s/|\\%s%n", dots, dots);
        System.out.printf("%s\\|/%s%n", dots, dots);

        for (int i = 0; i < 2 * n; i++) {
            dots = repeatString(".", dotCount);
            String dashes = repeatString("-", i);
            dotCount --;
            System.out.printf("%s*%s*%s*%s%n", dots, dashes, dashes, dots);
        }
        String asteriks = repeatString("*", 4 * n + 1);
        System.out.println(asteriks);
        System.out.printf("%s*%n", repeatString("*.", 2 * n));
        System.out.println(asteriks);
    }

    public static String repeatString(String str, int count){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
