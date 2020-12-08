package day9.Task1;

public class Teacher extends Human {
    private String subject;

    public String getSubjectName() {
        return subject;
    }

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподаватель с именем " + getName());
    }
}
