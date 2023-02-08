/* Write program that reads an integer between 1 and 10 from the user
Example:
Enter number between 1 and 10: -5
-5 is not between 1 and 10, try again: 12
12 is not between 1 and 10, try again: 4
4 is between 1 and 10


 */


import java.util.Scanner;
public class IntBetween1and10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number between 1 and 10: ");
        int num = scanner.nextInt();

        while (num >= 10 || num <= 1) {
            System.out.print(num + " is not between 1 and 10, try again: ");
            num = scanner.nextInt();
        }
        System.out.println(num + " is between 1 and 10");

    }
}

