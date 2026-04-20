class Outer {
    String message = "Сыртқы кластан сәлем!";

    // Ішкі класс
    class Inner {
        void display() {
            // Ішкі класс сыртқы кластың айнымалыларына қол жеткізе алады
            System.out.println("Inner class әдісі орындалды.");
            System.out.println("Хабарлама: " + message);
        }
    }
}

// Қолдану мысалы:
public class Main {
    public static void main(String[] args) {
        // 1. Сыртқы кластың объектісін құрамыз
        Outer outerObj = new Outer();

        // 2. Сол объект арқылы ішкі кластың объектісін құрамыз
        Outer.Inner innerObj = outerObj.new Inner();

        // 3. Ішкі кластың әдісін шақырамыз
        innerObj.display();
    }
}