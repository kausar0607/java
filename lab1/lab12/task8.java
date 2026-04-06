import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String result = input.replaceAll("[0-9]", "");

        System.out.println("Without numbers: " + result);
    }
}
