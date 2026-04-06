import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String noSpaces = input.replace(" ", "");

        System.out.println("Character count (without spaces): " + noSpaces.length());
    }
}{
}
