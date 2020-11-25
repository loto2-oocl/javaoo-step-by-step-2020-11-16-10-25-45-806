package practice06;

public class Teacher extends Person {
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass == null) {
            return String.format("%s I am a %s. I teach No Class.", super.introduce(), this.getClass().getSimpleName());
        }
        return String.format("%s I am a %s. I teach %s.", super.introduce(), this.getClass().getSimpleName(), this.getKlass().getDisplayName());
    }

    public String introduceWith(Student student) {
        if (this.getKlass().getNumber().equals(student.getKlass().getNumber())) {
            return String.format("%s I am a %s. I teach %s.", super.introduce(), this.getClass().getSimpleName(), student.getName());
        }
        return String.format("%s I am a %s. I don't teach %s.", super.introduce(), this.getClass().getSimpleName(), student.getName());
    }
}
