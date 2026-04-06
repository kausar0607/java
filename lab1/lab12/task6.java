import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("Enter ending:");
        String end = scanner.nextLine();

        System.out.println("Ends with given value: " + input.endsWith(end));
    }
}{
}
