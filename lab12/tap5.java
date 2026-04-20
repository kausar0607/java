public class StartsWithCheck {
    public static void main(String[] args) {
        String text = "Программалау негіздері";
        String searchWord = "Программалау";

        if (text.startsWith(searchWord)) {
            System.out.println("Иә, жол '" + searchWord + "' сөзінен басталады.");
        } else {
            System.out.println("Жоқ, жол басқа сөзден басталады.");
        }
    }
}