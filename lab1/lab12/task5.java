import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        System.out.println("Starts with given word: " + input.startsWith(word));
    }
}{
}
