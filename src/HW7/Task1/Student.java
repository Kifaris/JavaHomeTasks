package HW7.Task1;

import HW7.Task1.base.Subject;

public class Student extends Subject {
    private int levelOfKnowlege;
    public Student (String name, int age, String subject) {
        super(subject, name, age);
    }
    public void study(int skillTeach) {
        if (levelOfKnowlege >= skillTeach) {
        System.out.println("Студенту нечему научиться у учителя");
        return;
        }
        int a = 0;
        this.levelOfKnowlege = levelOfKnowlege + (a + (int) (Math.random() * skillTeach));
        System.out.println("Ученик " + name + "учиться. Предмет: " + subject);
    }

    public static Student[] getStudent() {
        Student[] students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = getStudent()[20];
        }
        return students;
    }

}
