import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String result = input.replace(" ", "");

        System.out.println("String without spaces: " + result);
    }
{
}
