public class VowelConsonantCounter {
    public static void main(String[] args) {
        String text = "Java бағдарламалау тілі";
        text = text.toLowerCase();

        int vowels = 0;
        int consonants = 0;
        String vowelChars = "aeiouаәоөұүыіеэияю";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                if (vowelChars.indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Дауысты әріптер саны: " + vowels);
        System.out.println("Дауыссыз әріптер саны: " + consonants);
    }
}