class University {
    String universityName = "Almaty Technological University";

    // Ішкі класс
    class Student {
        void showDetails(String name, String major) {
            System.out.println("Университет: " + universityName);
            System.out.println("Студенттің аты: " + name);
            System.out.println("Мамандығы: " + major);
        }
    }
}

// Қолдану:
public class Main {
    public static void main(String[] args) {
        University uni = new University();
        University.Student st = uni.new Student();
        st.showDetails("Айдос", "Ақпараттық жүйелер");
    }
}