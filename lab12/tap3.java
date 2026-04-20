public class LongestWord {
    public static void main(String[] args) {
        String text = "Ақпараттық технологиялар қарқынды дамуда";
        String[] words = text.split("\\s+"); // Бір немесе бірнеше бос орын бойынша бөлу

        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Ең ұзын сөз: " + longest);
        System.out.println("Ұзындығы: " + longest.length());
    }
}