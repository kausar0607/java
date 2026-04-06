import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        boolean isDigits = input.matches("\\d+");

        System.out.println("Is only digits: " + isDigits);
    }
}