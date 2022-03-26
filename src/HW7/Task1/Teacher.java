package HW7.Task1;

import HW7.Task1.base.Subject;

import java.util.Arrays;

public class Teacher extends Subject {
    private int SkillTeach;

    public Teacher(String subject, String name, int age) {
        super(subject, name, age);
    }

    public void setSkillTeach(int skillTeach) {
        SkillTeach = skillTeach;
    }
    public void teach(Student student) {
        student.study(SkillTeach);
        System.out.println("Учитель " + name + " учит ученика. Предмет: " + subject);
    }
    public static Teacher[] getTeacher() {
        Teacher[] teachers = new Teacher[5];
        for (int i = 0; i < teachers.length; i++) {
            teachers[i] = getTeacher()[5];
        }
        return teachers;
    }
}