package HW7.Task1;

import HW7.Task1.base.Human;

public class Director extends Human {
    public Director (String name, int age) {
        super(name, age);
    }
    public void start() {
        System.out.println("Начало занятий");
    }
    public void finish() {
        System.out.println("Окончание занятий");
    }
}
