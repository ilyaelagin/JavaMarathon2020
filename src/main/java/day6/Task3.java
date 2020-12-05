package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Олег Петров", "биология");
        Student student = new Student("Сергей Иванов");
        teacher.evaluate(student);
    }
}