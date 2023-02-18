import java.util.Scanner;
/*
write a method that gets the name of the user and a method that getss the age of the user
 */
public class GetNameAndAge {
    public static void main(String[] args) {
        System.out.print("Enter Your name: ");
        System.out.println(getName());

        System.out.println("Enter your age: ");
        System.out.println(getAge());


    }
    public static String getName(){

        Scanner scanner = new Scanner(System.in);

        return new Scanner(System.in).nextLine();
    }
    public static int getAge(){

        Scanner scanner = new Scanner(System.in);

        return new Scanner(System.in).nextInt();
    }
}

