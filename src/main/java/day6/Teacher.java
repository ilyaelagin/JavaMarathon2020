package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subjects;

    public Teacher(String name, String subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int assessment = random.nextInt(4) + 2;
        String assessmentString;
        if (assessment == 2) {
            assessmentString = "неудовлетворительно";
        } else if (assessment == 3) {
            assessmentString = "удовлетворительно";
        } else if (assessment == 4) {
            assessmentString = "хорошо";
        } else {
            assessmentString = "отлично";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                " по предмету " + subjects + " на оценку: " + assessmentString);
    }
}