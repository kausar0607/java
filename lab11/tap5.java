public class Task5 {
    public static void main(String[] args) {
        int choice = 1; // Мысалы, 1 таңдалды
        System.out.println("Таңдалған операция: " + choice);
        switch (choice) {
            case 1 -> System.out.println("Нәтиже: Қосу орындалуда");
            case 2 -> System.out.println("Нәтиже: Азайту орындалуда");
            case 3 -> System.out.println("Нәтиже: Көбейту орындалуда");
            case 4 -> System.out.println("Нәтиже: Бөлу орындалуда");
        }
    }
}