package practice02;

public class Student extends Person {
    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return String.format("I am a %s. I am at Class %d.", this.getClass().getSimpleName(), this.getKlass());
    }
}
