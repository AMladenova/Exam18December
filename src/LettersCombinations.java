import java.util.Scanner;

/**
 * Created by Dr-Br on 27.2.2017 г..
 */
public class LettersCombinations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char firstLetter = console.nextLine().charAt(0);
        char endLetter = console.nextLine().charAt(0);
        char ignoreLetter = console.nextLine().charAt(0);

        int sum = 0;

        for (char letter = firstLetter; letter <= endLetter; letter++) {
            for (char secondLetter = firstLetter; secondLetter <= endLetter; secondLetter++) {
                for (char thirdLetter = firstLetter; thirdLetter <= endLetter; thirdLetter++) {

                    // String resultCombination = String.format("%s%s%s ", letter, secondLetter, thirdLetter);
                    // boolean containsIgnoredLetter = resultCombination.contains(String.valueOf(ignoreLetter));
                    boolean containsIgnoredLetter = letter == ignoreLetter || secondLetter == ignoreLetter || thirdLetter == ignoreLetter;
                    if(!containsIgnoredLetter){
                        sum ++;
                        System.out.printf("%s%s%s ", letter, secondLetter, thirdLetter);
                        //System.out.printf("%s ", resultCombination);
                    }
                }
            }
        }
        System.out.print(sum);
    }
}
