import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> history = new ArrayList<>();
        history.add("5 + 5 = 10");
        history.add("10 * 2 = 20");

        System.out.println("Есептеулер тарихы:");
        history.forEach(System.out::println);
    }
}