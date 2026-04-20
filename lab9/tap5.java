class Config {
    // Статикалық айнымалылар
    static String appName = "MyApplication";
    static int version = 1;
}

// Қолдану мысалы:
public class Main {
    public static void main(String[] args) {
        // Объект құрудың қажеті жоқ
        System.out.println("Қосымша атауы: " + Config.appName);
        System.out.println("Нұсқасы: " + Config.version);
    }
}