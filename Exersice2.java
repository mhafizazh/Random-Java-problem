/*
Write program which reads a sequence of integers from the user and stops by displaying "Done"
when the sum of these values exceeds 100
 */
import java.util.Scanner;
public class Exersice2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Put random number");
        int sum = scanner.nextInt();

        while (sum <= 100) {
            System.out.println("more number");
            int sum2 = scanner.nextInt();
            sum = sum + sum2;

        }
        System.out.println("Done");
    }
}
