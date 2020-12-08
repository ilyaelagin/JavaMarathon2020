package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Иван", "АТ-13");
        Teacher teacher = new Teacher("Виктор", "физика");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
