import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String result = input.replaceAll("[aeiouAEIOUаәеёиоуыіүұө]", "*");

        System.out.println("Modified string: " + result);
    }
}