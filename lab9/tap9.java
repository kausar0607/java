class Computer {
    String model = "Gaming PC";

    // Ішкі класс
    class Processor {
        void displayFrequency(double frequency) {
            System.out.println(model + " компьютерінің процессор жиілігі: " + frequency + " GHz");
        }
    }
}

// Қолдану:
public class Main {
    public static void main(String[] args) {
        Computer myComp = new Computer();
        Computer.Processor myProc = myComp.new Processor();
        myProc.displayFrequency(4.2);
    }
}