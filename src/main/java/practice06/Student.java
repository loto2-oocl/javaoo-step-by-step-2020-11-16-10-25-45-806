package practice06;

public class Student extends Person {
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return String.format("%s I am a %s. I am at Class %d.", super.introduce(), this.getClass().getSimpleName(), this.getKlass().getNumber());
    }
}
