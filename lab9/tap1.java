class Student {
    String name;
    int age;
    static int count = 0; // Барлық объектілерге ортақ есептегіш

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        count++; // Әр объект құрылғанда 1-ге артады
    }
}