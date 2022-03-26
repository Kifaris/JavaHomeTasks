package HW7.Task1;

public class School {
    private final String titleSchool;
    private final Director director;
    private Teacher[] teachers;
    private Student[] students;
    public School (String titleSchool, Director director) {
        if (director == null || titleSchool == null) {
            throw new IllegalArgumentException("В школе должен быть директор и название");
        }
        this.director = director;
        this.titleSchool = titleSchool;
    }
    public String getTitleSchool() {
        return titleSchool;
    }
    public Director getDirector() {
        return director;
    }
    public void generateStudyGroup() {
        students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = Student.getStudent()[5];
        }
    }
    public void generateTeachers() {
            teachers = new Teacher[20];
            for (int i = 0; i < teachers.length; i++) {
                teachers[i] = Teacher.getTeacher()[20];
            }
    }
    public void schoolDay() {
        director.start();

        director.finish();

    }


}
