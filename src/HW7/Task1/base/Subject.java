package HW7.Task1.base;

abstract public class Subject extends Human {
    protected String subject;
    public Subject (String subject, String name, int age) {
        super(name, age);
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
}
