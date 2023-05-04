/* Using While loop write program that reads an integer between 1 and 10 from the user
Example:
Enter number between 1 and 10: -5
-5 is not between 1 and 10, try again: 12
12 is not between 1 and 10, try again: 4
4 is between 1 and 10


 */

import java.util.Scanner;

public class DoWhileLoopIntBetween1and10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number between 1 and 10: ");
        int num = scanner.nextInt();

        do {
            System.out.print(num + " is not between 1 and 10: ");
            num = scanner.nextInt();
        } while (num < 1 || num > 10);

        System.out.print(num + " is between 1 and 10");
    }
}
