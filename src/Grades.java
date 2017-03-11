import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by Dr-Br on 27.2.2017 г..
 */
public class Grades {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int studentsCount = Integer.parseInt(console.nextLine());

        int excellentGrade = 0;
        int veryGoodGrade = 0;
        int goodGrade = 0;
        int failedGrade = 0;

        double gradesSum = 0;

        for (int i = 0; i < studentsCount ; i++) {
            double grade = Double.parseDouble(console.nextLine());
            if(grade < 3.00){
                failedGrade ++;
            } else if (grade >= 3.00 && grade <= 3.99){
                goodGrade ++;
            } else if (grade > 3.99 && grade <= 4.99){
                veryGoodGrade ++;
            } else {
                excellentGrade ++;
            }
            gradesSum +=grade;
        }
        System.out.printf("Top students: %.2f%%%n", (double)excellentGrade / studentsCount * 100.0);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (double) veryGoodGrade / studentsCount * 100.0);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",(double) goodGrade / studentsCount * 100.00);
        System.out.printf("Fail: %.2f%%%n",(double) failedGrade / studentsCount * 100.00);
        System.out.printf("Average: %.2f",(gradesSum / studentsCount));
    }
}
