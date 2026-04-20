public class RemoveSpaces {
    public static void main(String[] args) {
        String text = "Java  тілін   үйрену  қызықты";
        String result = text.replace(" ", "");

        System.out.println("Бастапқы мәтін: " + text);
        System.out.println("Нәтиже: " + result);
    }
}