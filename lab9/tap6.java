class Config {
    static String appName;
    static int version;

    // Статикалық блок
    static {
        appName = "Java System";
        version = 3;
        System.out.println("Статикалық блок: Бастапқы мәндер орнатылды.");
    }
}

// Қолдану мысалы:
public class Main {
    public static void main(String[] args) {
        // Config класына алғаш рет жүгінгенде статикалық блок автоматты түрде істейді
        System.out.println("App: " + Config.appName);
    }
}