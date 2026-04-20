public class CharacterCounter {
    public static void main(String[] args) {
        String text = "Сәлем, әлем!";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Бос орынсыз таңбалар саны: " + count);
    }
}