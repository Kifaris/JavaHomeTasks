package HW7.Task1.base;

abstract public class Human {
    protected String name;
    protected int age;
    public Human (String name, int age) {
        if ( age < 1) {
            throw new IllegalArgumentException("Возраст должен быть положительным");
        }
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

}
