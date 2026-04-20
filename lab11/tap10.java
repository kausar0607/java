public class Task10 {
    public static void main(String[] args) {
        String expression = "2 + 3";
        String[] parts = expression.split(" ");

        double n1 = Double.parseDouble(parts[0]);
        String op = parts[1];
        double n2 = Double.parseDouble(parts[2]);

        if (op.equals("+")) {
            System.out.println("Өрнек нәтижесі: " + (n1 + n2));
        }
    }
}